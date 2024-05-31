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
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "")
    private Long categoryId;

    @Column(name = "")
    private String categoryName;

    @Column(name = "")
    private String categoryDescription;

    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinTable(name = "",
            joinColumns = @JoinColumn(name = ""),
            inverseJoinColumns = @JoinColumn(name = ""))
    private Collection<Category> productId;

    public Category(String categoryName, String categoryDescription){
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
    }
}
