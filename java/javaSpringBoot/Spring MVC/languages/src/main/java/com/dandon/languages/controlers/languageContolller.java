package com.dandon.languages.controlers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dandon.languages.models.language;
import com.dandon.languages.services.languageService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/languages")
public class languageContolller {

    @Autowired
    private languageService LanguageService;

    @GetMapping
    public String getAllLanguages(Model model) {
        model.addAttribute("languages", LanguageService.getAllLanguages());
        return "languages/index";
    }

    @GetMapping("/new") 
    public String showNewLanguageForm(Model model) {
        model.addAttribute("language", new language());
        return "languages/new";
    }

    @PostMapping
    public String saveLanguage(@Valid @ModelAttribute("language") language language, BindingResult result) {
        if (result.hasErrors()) {
            return "languages/new";
        }
        LanguageService.saveLanguage(language);
        return "redirect:/languages";
    }

    @GetMapping("/{id}")
    public String showLanguage(@PathVariable Long id, Model model) {
        Optional<language> language = LanguageService.getLanguageById(id);
        if (language.isPresent()) {
            model.addAttribute("language", language.get());
            return "languages/show";
        } else {
            return "redirect:/languages";
        }
    }

    @GetMapping("/{id}/edit")
    public String showEditLanguageForm(@PathVariable Long id, Model model) {
        Optional<language> language = LanguageService.getLanguageById(id);
        if (language.isPresent()) {
            model.addAttribute("language", language.get());
            return "languages/edit";
        } else {
            return "redirect:/languages";
        }
    }

    @PostMapping("/{id}")
    public String updateLanguage(@PathVariable Long id, @Valid @ModelAttribute("language") language language, BindingResult result) {
        if (result.hasErrors()) {
            return "languages/edit";
        }
        language.setId(id);
        LanguageService.saveLanguage(language);
        return "redirect:/languages";
    }

    @PostMapping("/{id}/delete")
    public String deleteLanguage(@PathVariable Long id) {
        LanguageService.deleteLanguage(id);
        return "redirect:/languages";
    }
}