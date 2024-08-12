package com.dandon.ProductsCategories.repositories;

import com.dandon.ProductsCategories.models.Prodect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.dandon.ProductsCategories.models.Category;
import java.util.List;

public interface ProductRepository extends JpaRepository<Prodect, Long> {
    // Example of a custom query to find categories for a specific product
    @Query("SELECT p.categories FROM Product p WHERE p.id = :productId")
    List<Category> findCategoriesByProductId(@Param("productId") Long productId);
}