package com.fleming99.ProductsManagement.application;

import com.fleming99.ProductsManagement.adapters.CategoryRepository;
import com.fleming99.ProductsManagement.adapters.ProductRepository;
import com.fleming99.ProductsManagement.core.dto.ProductDTO;
import com.fleming99.ProductsManagement.core.entities.Category;
import com.fleming99.ProductsManagement.core.entities.Product;
import com.fleming99.ProductsManagement.core.usecases.ProductUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductUseCase {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Product> showProductsList() {
        return productRepository.findAll();
    }

    @Override
    public Product addNewProduct(ProductDTO productDTO) {

        List<Category> categories = categoryRepository.findAllById(productDTO.categories());

        Product product = new Product(productDTO.productId(), productDTO.productName(), productDTO.productDescription(),
                productDTO.productQuantity(), productDTO.productPrice(), productDTO.productStatus(), categories);

        return productRepository.save(product);
    }

    @Override
    public Product findProductById(long id) {
        return productRepository.findProductById(id);
    }

    @Override
    public void deleteProductById(long id) {
        productRepository.deleteById(id);
    }
}
