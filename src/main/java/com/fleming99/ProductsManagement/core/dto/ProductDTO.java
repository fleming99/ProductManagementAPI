package com.fleming99.ProductsManagement.core.dto;

import java.util.Collection;

public record ProductDTO(Long productId, String productName, String productDescription, int productQuantity,
                         double productPrice, boolean productStatus, Collection<Long> categories) {
}
