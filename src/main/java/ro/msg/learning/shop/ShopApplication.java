package ro.msg.learning.shop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ro.msg.learning.shop.models.Location;
import ro.msg.learning.shop.models.Product;
import ro.msg.learning.shop.models.ProductCategory;
import ro.msg.learning.shop.models.Supplier;
import ro.msg.learning.shop.repositories.LocationRepository;
import ro.msg.learning.shop.repositories.ProductCategoryRepository;
import ro.msg.learning.shop.repositories.ProductRepository;
import ro.msg.learning.shop.repositories.SupplierRepository;

import java.util.List;
import java.util.Optional;

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

		LocationRepository locRepo = context.getBean(LocationRepository.class);
		Location depo3 = locRepo.findByName("deposit 3");
		log.info(depo3.toString());

		ProductRepository prodRepo = context.getBean(ProductRepository.class);
		List<Product> products = prodRepo.findAll();
		log.info(products.toString());
	}

}
