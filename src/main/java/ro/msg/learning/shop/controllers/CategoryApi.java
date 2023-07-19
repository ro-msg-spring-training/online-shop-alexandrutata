package ro.msg.learning.shop.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.msg.learning.shop.models.Category;
import ro.msg.learning.shop.services.CategoryService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class CategoryApi {
    private final CategoryService categoryService;

    @GetMapping(value = "/category/{name}")
    public ResponseEntity<Category> findByName(@PathVariable("name") String name) {
        Category category = categoryService.findByName(name);
        return ResponseEntity.ok(category);
    }

    @GetMapping(value = "/category")
    public ResponseEntity<List<Category>> findAll() {
        List<Category> categories = categoryService.findAll();
        return ResponseEntity.ok(categories);
    }
}
