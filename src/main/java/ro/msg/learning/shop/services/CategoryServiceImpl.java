package ro.msg.learning.shop.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.msg.learning.shop.models.Category;
import ro.msg.learning.shop.repositories.CategoryRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository repository;

    @Override
    public Category findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<Category> findAll() {
        return repository.findAll();
    }
}
