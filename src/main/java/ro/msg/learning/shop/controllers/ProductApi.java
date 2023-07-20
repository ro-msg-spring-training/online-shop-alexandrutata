package ro.msg.learning.shop.controllers;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.msg.learning.shop.dtos.ProductDto;
import ro.msg.learning.shop.dtos.ProductRequestDto;
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

    @PostMapping(value = "/product")
    public ResponseEntity<Integer> create(@RequestBody ProductRequestDto product) {
        int productId = productService.create(product);
        return ResponseEntity.ok(productId);
    }

    @PutMapping(value = "/product")
    public ResponseEntity<Void> update(@RequestBody ProductRequestDto product) {
        try {
            productService.update(product);
            return ResponseEntity.ok().build();
        } catch (EntityNotFoundException ex){
            log.error("No product found for id {}", product.getId());
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "/product/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int id) {
        productService.delete(id);
        return ResponseEntity.ok().build();
    }
}
