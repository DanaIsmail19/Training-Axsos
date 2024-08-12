package com.dandon.BookClub.Controllers;

import com.dandon.BookClub.models.User;
import com.dandon.BookClub.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServices userService;

    // Registration Page
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    // Process Registration
    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user, RedirectAttributes redirectAttributes) {
        User savedUser = userService.registerUser(user);
        redirectAttributes.addFlashAttribute("successMessage", "Registration successful!");
        return "redirect:/login";
    }

    // Login Page
    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    // Process Login
    @PostMapping("/login")
    public String loginUser(@RequestParam String email, @RequestParam String password, Model model) {
        User user = userService.validateUser(email, password);
        if (user != null) {
            model.addAttribute("user", user);
            return "redirect:/books";
        } else {
            model.addAttribute("errorMessage", "Invalid credentials");
            return "login";
        }
    }
}