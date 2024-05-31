package com.fleming99.ProductsManagement.core.usecases;

import com.fleming99.ProductsManagement.core.entities.Category;

import java.util.List;

public interface CategoryUseCase {

    List<Category> showCategoriesList();

    Category addNewCategory(Category category);

    Category findCategoryById(long id);

    void deleteCategoryById(long id);
}
