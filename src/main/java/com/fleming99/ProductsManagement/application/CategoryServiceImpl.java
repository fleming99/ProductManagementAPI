package com.fleming99.ProductsManagement.application;

import com.fleming99.ProductsManagement.adapters.CategoryRepository;
import com.fleming99.ProductsManagement.core.entities.Category;
import com.fleming99.ProductsManagement.core.usecases.CategoryUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryUseCase {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> showCategoriesList() {
        return categoryRepository.findAll();
    }

    @Override
    public Category addNewCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category findCategoryById(long id) {
        return categoryRepository.findCategoryById(id);
    }

    @Override
    public void deleteCategoryById(long id) {
        categoryRepository.deleteById(id);
    }
}
