package ro.msg.learning.shop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import ro.msg.learning.shop.model.Customer;
import ro.msg.learning.shop.model.Supplier;
import ro.msg.learning.shop.repository.CustomerRepository;
import ro.msg.learning.shop.repository.SupplierRepository;

@SpringBootTest
@ActiveProfiles("test")
class ShopApplicationTests {

	@Autowired
	private SupplierRepository supplierRepository;

	@Autowired
	private CustomerRepository customerRepository;

	@Test
	void testSupplierPersistance() {
		var supplier = Supplier.builder()
				.name("my first supplier")
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
}