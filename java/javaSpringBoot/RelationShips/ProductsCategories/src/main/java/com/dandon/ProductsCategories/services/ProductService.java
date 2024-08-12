package com.dandon.ProductsCategories.services;

import com.dandon.ProductsCategories.models.Prodect;
import com.dandon.ProductsCategories.repositories.ProductRepository;
import com.dandon.ProductsCategories.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.dandon.ProductsCategories.models.Category;


import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    // Find all products
    public List<Prodect> findAllProducts() {
        return productRepository.findAll();
    }

    // Save a new product
    @Transactional
    public Prodect saveProduct(Prodect product) {
        return productRepository.save(product);
    }

    // Find a single product by ID
    public Prodect findProductById(Long productId) {
        return productRepository.findById(productId).orElse(null);
    }

    // Get categories associated with a specific product
    public List<Category> findCategoriesByProductId(Long productId) {
        return productRepository.findCategoriesByProductId(productId);
    }
}