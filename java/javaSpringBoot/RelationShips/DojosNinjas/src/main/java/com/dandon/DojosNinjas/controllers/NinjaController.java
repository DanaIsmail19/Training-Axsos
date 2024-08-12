package com.dandon.DojosNinjas.controllers;

import com.dandon.DojosNinjas.models.NinjaModel;
import com.dandon.DojosNinjas.Services.NinjaService;
import com.dandon.DojosNinjas.Services.DojoServices;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/ninjas")
public class NinjaController {
    private final NinjaService ninjaService;
    private final DojoServices dojoService;

  
    public NinjaController(NinjaService ninjaService, DojoServices dojoService) {
        this.ninjaService = ninjaService;
        this.dojoService = dojoService;
    }

    // Display form for creating a new ninja
    @GetMapping("/new")
    public String newNinja(Model model) {
        model.addAttribute("ninja", new NinjaModel());
        model.addAttribute("dojos", dojoService.findAllDojos());
        return "ninjas/new-ninja";
    }

    // Process the form for creating a new ninja
    @PostMapping
    public String createNinja(@ModelAttribute NinjaModel ninja) {
        ninjaService.saveNinja(ninja);
        return "redirect:/ninjas";
    }

    // List all ninjas
    @GetMapping
    public String listNinjas(Model model) {
        model.addAttribute("ninjas", ninjaService.findAllNinjas());
        return "ninjas/list-ninjas";
    }
}