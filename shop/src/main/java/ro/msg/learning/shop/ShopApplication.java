package ro.msg.learning.shop;

import java.time.LocalDateTime;

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

		var context = SpringApplication.run(ShopApplication.class, args);
		
		log.info("------- > App started at {}...", LocalDateTime.now());

		var repo = context.getBean(SupplierRepository.class);
		
		var supplier = Supplier.builder()
			//.id(24)
			.name("my first supplier")
			.build();

		repo.save(supplier);

		var supplier2 = repo.findById(1).orElse(new Supplier());
		String name = supplier2.getName();

		System.out.println("name " + name);

	}
}