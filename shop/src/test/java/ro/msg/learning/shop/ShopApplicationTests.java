package ro.msg.learning.shop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import ro.msg.learning.shop.dto.ProdAndCategoryDTO;
import ro.msg.learning.shop.model.Customer;
import ro.msg.learning.shop.model.Supplier;
import ro.msg.learning.shop.repository.CustomerRepository;
import ro.msg.learning.shop.repository.SupplierRepository;
import ro.msg.learning.shop.service.ProductService;

@SpringBootTest
@ActiveProfiles("test")
class ShopApplicationTests {

	@Autowired
	private SupplierRepository supplierRepository;

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private ProductService productService;

	@Test
	void testSupplierPersistance() {
		var supplier = Supplier.builder()
				.name("my first supplier")
				.id(6)
				.build();

		supplierRepository.save(supplier);

		var supplier2 = supplierRepository.findById(1).orElse(new Supplier());
		var name = supplier2.getName();
		assertEquals(supplier.getName(), name);
	}

	@Test
	void testCustomerPersistance() {
		var customer1 = Customer.builder()
				.firstName("myFirstName")
				.lastName("myLastName")
				.username("username")
				.password("password")
				.email("myEmail")
				.build();
		var customer2 = Customer.builder()
				.firstName("myFirstName2")
				.lastName("myLastName2")
				.username("username2")
				.password("password2")
				.email("myEmail2")
				.build();
		var customer3 = Customer.builder()
				.firstName("myFirstName3")
				.lastName("myLastName3")
				.username("username3")
				.password("password3")
				.email("myEmail2")
				.build();

		customerRepository.save(customer1);
		customerRepository.save(customer2);
		customerRepository.save(customer3);

		int size = customerRepository.findAll().size();
		assertEquals(3, size);

		String email2 = customerRepository.findById(2).get().getEmail();
		assertEquals("myEmail2", email2);

		Customer customer = customerRepository.findByEmailAndFirstName("myEmail2", "myFirstName3");
		assertEquals("myFirstName3", customer.getFirstName());

		var customers = customerRepository.findByEmail("myEmail2");
		assertTrue(customers.stream().anyMatch(c -> c.getFirstName().equals("myFirstName3")));
		assertTrue(customers.stream().anyMatch(c -> c.getFirstName().equals("myFirstName2")));
		assertTrue(customers.stream().noneMatch(c -> c.getFirstName().equals("myFirstName")));
	}

	@Test
	void testProductService(){
		var prodCatDTO = ProdAndCategoryDTO.builder()
			.name("prodName1")
			.description("prodDesc1")
			.price(new BigDecimal(1))
			.weight(1d)
			.imageURL("prodImg1")
			.categoryName("catName1")
			.categoryDesc("catDesc1")
			.supplierName("supName1")
			.build();
		productService.create(prodCatDTO);
		assertNotEquals(0, prodCatDTO.getId());
	}
}