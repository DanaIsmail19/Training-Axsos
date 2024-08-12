package com.dandon.ProductsCategories.services;

import com.dandon.ProductsCategories.models.Category;
import com.dandon.ProductsCategories.repositories.CategoryRepository;
import com.dandon.ProductsCategories.models.Prodect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    // Find all categories
    public List<Category> findAllCategories() {
        return categoryRepository.findAll();
    }

    // Save a new category
    @Transactional
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    // Find a single category by ID
    public Category findCategoryById(Long categoryId) {
        return categoryRepository.findById(categoryId).orElse(null);
    }

    // Get products associated with a specific category
    public List<Prodect> findProductsByCategoryId(Long categoryId) {
        return categoryRepository.findProductsByCategoryId(categoryId);
    }

    // Optionally, find categories not associated with a given product
    public List<Category> findCategoriesNotInProduct(Long productId) {
        return categoryRepository.findCategoriesNotInProduct(productId);
    }
}