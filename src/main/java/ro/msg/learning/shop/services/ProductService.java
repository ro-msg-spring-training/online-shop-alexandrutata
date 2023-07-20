package ro.msg.learning.shop.services;

import ro.msg.learning.shop.dtos.ProductDto;
import ro.msg.learning.shop.dtos.ProductRequestDto;

import java.util.List;

public interface ProductService {
    ProductDto readById(int id);
    List<ProductDto> readAll();
    int create(ProductRequestDto product);
    void update(ProductRequestDto product);
    void delete(int id);
}
