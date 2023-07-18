package ro.msg.learning.shop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ro.msg.learning.shop.models.ProductCategory;
import ro.msg.learning.shop.models.Supplier;
import ro.msg.learning.shop.repositories.ProductCategoryRepository;
import ro.msg.learning.shop.repositories.SupplierRepository;

@Slf4j
@SpringBootApplication
public class ShopApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(ShopApplication.class, args);

		ProductCategoryRepository pcRepo = context.getBean(ProductCategoryRepository.class);
		ProductCategory pc = pcRepo.findByName("toys");
		log.info(pc.toString());

		SupplierRepository supplierRepo = context.getBean(SupplierRepository.class);
		Supplier emag = supplierRepo.findByName("emag");
		log.info(emag.toString());
	}

}
