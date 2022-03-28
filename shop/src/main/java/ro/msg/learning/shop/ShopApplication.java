package ro.msg.learning.shop;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;
import ro.msg.learning.shop.model.Supplier;
import ro.msg.learning.shop.repository.SupplierRepository;

@Slf4j
@SpringBootApplication
public class ShopApplication {

	public static void main(String[] args) {
		log.info("------- > Starting application at {}", LocalDateTime.now());

		SpringApplication.run(ShopApplication.class, args);
		
		log.info("------- > App started at {}...", LocalDateTime.now());

		// var testRepo = (new ShopApplication()).new TestRepo();
		// testRepo.test();
	}

	public class TestRepo{
	
		@Autowired
		private SupplierRepository supplierRepository;
	
		public void test(){
			var supplier = Supplier.builder()
				.id(24)
				.name("my first supplier")
				.build();
	
			supplierRepository.save(supplier);
	
			var supplier2 = supplierRepository.getById(24);
			int id = supplier2.getId();
			var name = supplier2.getName();
		}
	}
	
}