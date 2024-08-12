package com.dandon.ProductsCategories.Controllers;

import com.dandon.ProductsCategories.models.Prodect;
import com.dandon.ProductsCategories.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/products")
public class ProdectController {

    @Autowired
    private ProductService productService;

    // Display all products
    @GetMapping
    public String listProducts(Model model) {
        model.addAttribute("products", productService.findAllProducts());
        return "products/list-products";
    }

    // Display form to add a new product
    @GetMapping("/new")
    public String newProductForm(Model model) {
        model.addAttribute("product", new Prodect());
        return "products/new-product";
    }

    // Process the form for adding a new product
    @PostMapping
    public String createProduct(@ModelAttribute Prodect product) {
        productService.saveProduct(product);
        return "redirect:/products";
    }

    // Product details and category management
    @GetMapping("/{productId}")
    public String showProduct(@PathVariable Long productId, Model model) {
        Prodect product = productService.findProductById(productId);
        model.addAttribute("product", product);
        model.addAttribute("categories", productService.findCategoriesByProductId(productId));
        return "products/show-product";
    }
}