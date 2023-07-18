package ro.msg.learning.shop.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.msg.learning.shop.models.ProductCategory;
import ro.msg.learning.shop.repositories.ProductCategoryRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductCategoryServiceImpl implements ProductCategoryService{
    private final ProductCategoryRepository repository;

    @Override
    public ProductCategory findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }
}
