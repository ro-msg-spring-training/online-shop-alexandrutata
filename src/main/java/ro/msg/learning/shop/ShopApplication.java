package ro.msg.learning.shop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ro.msg.learning.shop.models.*;
import ro.msg.learning.shop.repositories.*;

import java.util.List;

@Slf4j
@SpringBootApplication
public class ShopApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(ShopApplication.class, args);

		CategoryRepository pcRepo = context.getBean(CategoryRepository.class);
		Category pc = pcRepo.findByName("toys");
		log.info(pc.toString());

		SupplierRepository supplierRepo = context.getBean(SupplierRepository.class);
		Supplier emag = supplierRepo.findByName("emag");
		log.info(emag.toString());

		LocationRepository locRepo = context.getBean(LocationRepository.class);
		Location depo3 = locRepo.findByName("deposit 3");
		log.info(depo3.toString());

		ProductRepository prodRepo = context.getBean(ProductRepository.class);
		List<Product> products = prodRepo.findAll();
		log.info(products.toString());

		CustomerRepository custRepo = context.getBean(CustomerRepository.class);
		List<Customer> customers = custRepo.findAll();
		log.info(customers.toString());

		OrderRepository orderRepo = context.getBean(OrderRepository.class);
		List<Order> orders = orderRepo.findAll();
		log.info(orders.toString());
	}

}
