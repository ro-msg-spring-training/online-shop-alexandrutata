package ro.msg.learning.shop.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.msg.learning.shop.dtos.ProductDto;
import ro.msg.learning.shop.services.ProductService;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequiredArgsConstructor
@Slf4j
public class ProductApi {
    private final ProductService productService;

    @GetMapping(value = "/product/{id}")
    public ResponseEntity<ProductDto> readById(@PathVariable("id") int id) {
        try {
            ProductDto product = productService.readById(id);
            return ResponseEntity.ok(product);
        } catch (NoSuchElementException ex){
            log.error("No product found for id {}", id);
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(value = "/product")
    public ResponseEntity<List<ProductDto>> readAll() {
        List<ProductDto> products = productService.readAll();
        return ResponseEntity.ok(products);
    }
}
