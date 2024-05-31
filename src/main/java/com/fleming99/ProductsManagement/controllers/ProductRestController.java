package com.fleming99.ProductsManagement.controllers;

import com.fleming99.ProductsManagement.adapters.CategoryRepository;
import com.fleming99.ProductsManagement.adapters.ProductRepository;
import com.fleming99.ProductsManagement.application.CategoryServiceImpl;
import com.fleming99.ProductsManagement.application.ProductServiceImpl;
import com.fleming99.ProductsManagement.core.dto.ProductDTO;
import com.fleming99.ProductsManagement.core.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductRestController {

    private final ProductServiceImpl productService;

    @Autowired
    public ProductRestController(ProductServiceImpl productService, ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> getProductsList(){

        try{
            List<Product> products = productService.showProductsList();
            return new ResponseEntity<>(products, HttpStatus.OK);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage(), e.getCause());
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id){

        try{
            return new ResponseEntity<>(productService.findProductById(id), HttpStatus.OK);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage(), e.getCause());
        }
    }

    @PostMapping
    public ResponseEntity<Product> addNewProduct(@RequestBody ProductDTO productDTO){

        try {
            return new ResponseEntity<>(productService.addNewProduct(productDTO), HttpStatus.CREATED);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage(), e.getCause());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody ProductDTO productDTO){

        try {
            return new ResponseEntity<>(productService.addNewProduct(productDTO), HttpStatus.OK);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage(), e.getCause());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Product> deleteProductById(@PathVariable Long id){

        try{
            productService.deleteProductById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage(), e.getCause());
        }
    }

}
