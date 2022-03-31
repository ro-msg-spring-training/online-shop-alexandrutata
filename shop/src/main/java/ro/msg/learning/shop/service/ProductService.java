package ro.msg.learning.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.msg.learning.shop.dto.ProdAndCategoryDTO;
import ro.msg.learning.shop.model.Product;
import ro.msg.learning.shop.model.ProductCategory;
import ro.msg.learning.shop.model.Supplier;
import ro.msg.learning.shop.repository.ProductCategoryRepository;
import ro.msg.learning.shop.repository.ProductRepository;
import ro.msg.learning.shop.repository.SupplierRepository;

@Service
public class ProductService {
    @Autowired
    private ProductCategoryRepository productCategoryRepository;
    @Autowired
    private SupplierRepository supplierRepository;
    @Autowired
    private ProductRepository productRepository;

    public ProdAndCategoryDTO create(ProdAndCategoryDTO prodAndCategoryDTO) {
        ProductCategory productCategory;
        if(productCategoryRepository.existsByName(prodAndCategoryDTO.getCategoryName())){
            productCategory = productCategoryRepository.findByName(prodAndCategoryDTO.getCategoryName());
        }
        else{
            productCategory = productCategoryRepository.save(ProductCategory.builder()
                .name(prodAndCategoryDTO.getCategoryName())
                .description(prodAndCategoryDTO.getCategoryDesc())
                .build());
        }

        Supplier supplier;
        if(supplierRepository.existsByName(prodAndCategoryDTO.getSupplierName())){
            supplier = supplierRepository.findByName(prodAndCategoryDTO.getSupplierName());
        }
        else{
            supplier = supplierRepository.save(Supplier.builder()
                .name(prodAndCategoryDTO.getSupplierName())
                .build());
        }

        Product product = productRepository.save(prodAndCategoryDTO.getProduct(productCategory, supplier));
        prodAndCategoryDTO.setId(product.getId());

        return prodAndCategoryDTO;
    } 
}
