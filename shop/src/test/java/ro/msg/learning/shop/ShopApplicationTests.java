package ro.msg.learning.shop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import ro.msg.learning.shop.entities.Supplier;
import ro.msg.learning.shop.repositories.SupplierRepository;

@SpringBootTest
@ActiveProfiles("test")
class ShopApplicationTests {

	@Autowired
	private SupplierRepository supplierRepository;

	@Test
	void contextLoads() {
		var supplier = Supplier.builder()
				.id(1)
				.name("my first supplier")
				.build();
	
		supplierRepository.save(supplier);

		var name = supplierRepository.getById(1).getName();
		assertEquals(supplier.getName(), name);
	}

}
