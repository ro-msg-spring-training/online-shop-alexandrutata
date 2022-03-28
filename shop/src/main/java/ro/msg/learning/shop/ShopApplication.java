package ro.msg.learning.shop;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class ShopApplication {

	public static void main(String[] args) {
		log.info("------- > Starting application at {}", LocalDateTime.now());

		SpringApplication.run(ShopApplication.class, args);
		
		log.info("------- > App started at {}...", LocalDateTime.now());
	}

	public ShopApplication(){
		var testRepo = new TestRepository();
		testRepo.test();
	}
}