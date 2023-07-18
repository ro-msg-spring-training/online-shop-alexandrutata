package ro.msg.learning.shop.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.msg.learning.shop.models.ProductCategory;
import ro.msg.learning.shop.services.ProductCategoryService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class ProductCategoryApi {
    private final ProductCategoryService productCategoryService;

    @GetMapping(value = "/productCategory/{name}")
    public ResponseEntity<ProductCategory> findByName(@PathVariable("name") String name) {
        ProductCategory category = productCategoryService.findByName(name);
        return ResponseEntity.ok(category);
    }

    @GetMapping(value = "/productCategory")
    public ResponseEntity<List<ProductCategory>> findAll() {
        List<ProductCategory> categories = productCategoryService.findAll();
        return ResponseEntity.ok(categories);
    }
}
