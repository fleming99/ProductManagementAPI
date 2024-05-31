package com.fleming99.ProductsManagement.adapters;

import com.fleming99.ProductsManagement.core.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE p.productId = ?1")
    Product findProductById(long theId);
}
