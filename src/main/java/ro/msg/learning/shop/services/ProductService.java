package ro.msg.learning.shop.services;

import ro.msg.learning.shop.dtos.ProductDto;

import java.util.List;

public interface ProductService {
    ProductDto readById(int id);
    List<ProductDto> readAll();
    ProductDto create(ProductDto product);
    void update(ProductDto product);
    void delete(int id);
}
