package com.fleming99.ProductsManagement.core.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "")
    private Long productId;

    @Column(name = "")
    private String productName;

    @Column(name = "")
    private String productDescription;

    @Column(name = "")
    private int productQuantity;

    @Column(name = "")
    private double productPrice;

    @Column(name = "")
    private boolean productStatus;

    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinTable(name = "",
            joinColumns = @JoinColumn(name = ""),
            inverseJoinColumns = @JoinColumn(name = ""))
    private Collection<Category> categories;

    public Product(String productName, String productDescription, int productQuantity, double productPrice, Collection<Category> categories) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
        this.productStatus = true;
        this.categories = categories;
    }
}
