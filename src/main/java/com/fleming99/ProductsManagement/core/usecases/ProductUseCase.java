package com.fleming99.ProductsManagement.core.usecases;

import com.fleming99.ProductsManagement.core.dto.ProductDTO;
import com.fleming99.ProductsManagement.core.entities.Product;

import java.util.List;

public interface ProductUseCase {

    List<Product> showProductsList();

    Product addNewProduct(ProductDTO productDTO);

    Product findProductById(long id);

    void deleteProductById(long id);
}
