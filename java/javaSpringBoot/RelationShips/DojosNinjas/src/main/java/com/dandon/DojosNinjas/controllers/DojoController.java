package com.dandon.DojosNinjas.controllers;

import com.dandon.DojosNinjas.models.DojoModel;
import com.dandon.DojosNinjas.Services.DojoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/dojos")
public class DojoController {
    private final DojoServices dojoService;

    @Autowired
    public DojoController(DojoServices dojoService) {
        this.dojoService = dojoService;
    }

    // Display form for creating a new dojo
    @GetMapping("/new")
    public String newDojo(Model model) {
        model.addAttribute("dojo", new DojoModel());
        return "dojos/new-dojo";
    }

    // Process the form for creating a new dojo
    @PostMapping
    public String createDojo(@ModelAttribute DojoModel dojo) {
        dojoService.saveDojo(dojo);
        return "redirect:/dojos";
    }

    // Show a list of all dojos
    @GetMapping
    public String listDojos(Model model) {
        model.addAttribute("dojos", dojoService.findAllDojos());
        return "dojos/list-dojos";
    }

    // Show details of a specific dojo
    @GetMapping("/{id}")
    public String showDojo(@PathVariable Long id, Model model) {
        DojoModel dojo = dojoService.findDojoById(id)
            .orElseThrow(() -> new IllegalArgumentException("Invalid dojo Id:" + id));
        model.addAttribute("dojo", dojo);
        return "dojos/show-dojo";
    }
}