package com.fleming99.ProductsManagement.controllers;

import com.fleming99.ProductsManagement.application.CategoryServiceImpl;
import com.fleming99.ProductsManagement.core.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categories")
public class CategoryRestController {

    private final CategoryServiceImpl categoryService;

    @Autowired
    public CategoryRestController(CategoryServiceImpl categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<List<Category>> getCategoriesList(){

        try{
            List<Category> categories = categoryService.showCategoriesList();
            return new ResponseEntity<>(categories, HttpStatus.OK);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage(), e.getCause());
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable Long id){

        try{
            Category category = categoryService.findCategoryById(id);
            return new ResponseEntity<>(category, HttpStatus.OK);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage(), e.getCause());
        }
    }

    @PostMapping
    public ResponseEntity<Category> addNewCategory(@RequestBody Category category){

        try {
            categoryService.addNewCategory(category);
            return new ResponseEntity<>(category, HttpStatus.CREATED);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage(), e.getCause());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Category> updateCategory(@PathVariable Long id, @RequestBody Category category){

        try{
            categoryService.addNewCategory(category);
            return new ResponseEntity<>(category, HttpStatus.OK);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage(), e.getCause());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Category> deleteCategoryById(@PathVariable Long id){

        try{
            categoryService.deleteCategoryById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage(), e.getCause());
        }
    }
}
