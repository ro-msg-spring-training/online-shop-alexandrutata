package ro.msg.learning.shop.services;

import ro.msg.learning.shop.models.ProductCategory;

import java.util.List;

public interface ProductCategoryService {
    ProductCategory findByName(String name);
    public List<ProductCategory> findAll();
}
