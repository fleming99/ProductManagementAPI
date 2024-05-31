package com.fleming99.ProductsManagement.adapters;

import com.fleming99.ProductsManagement.core.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    @Query("SELECT c FROM Category c WHERE c.categoryId = ?1")
    Category findCategoryById(long theId);
}
