package ro.msg.learning.shop.services;

import ro.msg.learning.shop.models.Category;

import java.util.List;

public interface CategoryService {
    Category findByName(String name);
    List<Category> findAll();
}
