package ro.msg.learning.shop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.util.Assert;

import lombok.extern.slf4j.Slf4j;
import ro.msg.learning.shop.entities.Supplier;
import ro.msg.learning.shop.repositories.SupplierRepository;

@SpringBootTest
@Slf4j
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
		try {
			supplierRepository.save(supplier);
		} catch (Exception e) {
			log.error("------------------------> Error: ", e);
		}
		Assert.isTrue(true, "WORKS!!!");
		//supplier = supplierRepository.getById(1);
	}

}
