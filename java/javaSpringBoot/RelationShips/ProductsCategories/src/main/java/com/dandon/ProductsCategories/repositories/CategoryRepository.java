package com.dandon.ProductsCategories.repositories;

import com.dandon.ProductsCategories.models.Category;
import com.dandon.ProductsCategories.models.Prodect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    // Custom query to find products that belong to a specific category
    @Query("SELECT c.products FROM Category c WHERE c.id = :categoryId")
    List<Prodect> findProductsByCategoryId(@Param("categoryId") Long categoryId);

    // Optionally, to find categories not associated with a particular product
    @Query("SELECT c FROM Category c WHERE c.id NOT IN (SELECT cp.categories.id FROM Product p JOIN p.categories cp WHERE p.id = :productId)")
    List<Category> findCategoriesNotInProduct(@Param("productId") Long productId);
}