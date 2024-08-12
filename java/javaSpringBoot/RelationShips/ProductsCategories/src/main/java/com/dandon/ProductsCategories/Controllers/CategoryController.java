package com.dandon.ProductsCategories.Controllers;

import com.dandon.ProductsCategories.models.Category;
import com.dandon.ProductsCategories.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    // Display all categories
    @GetMapping
    public String listCategories(Model model) {
        model.addAttribute("categories", categoryService.findAllCategories());
        return "categories/list-categories";
    }

    // Display form to add a new category
    @GetMapping("/new")
    public String newCategoryForm(Model model) {
        model.addAttribute("category", new Category());
        return "categories/new-category";
    }

    // Process the form for adding a new category
    @PostMapping
    public String createCategory(@ModelAttribute Category category) {
        categoryService.saveCategory(category);
        return "redirect:/categories";
    }

    // Category details and product management
    @GetMapping("/{categoryId}")
    public String showCategory(@PathVariable Long categoryId, Model model) {
        Category category = categoryService.findCategoryById(categoryId);
        model.addAttribute("category", category);
        model.addAttribute("products", categoryService.findProductsByCategoryId(categoryId));
        return "categories/show-category";
    }
}