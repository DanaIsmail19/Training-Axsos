package com.Dandon.HappersReceipt;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;


@Controller
@RestController
public class HomeController {

    @RequestMapping("/")
    public String index(Model model) {
        String name = "Ada Lovelace";
        String itemName = "Aluminum wire";
        double price = 7.50;
        String description = "High-quality aluminum wire.";
        String vendor = "Tech Supplies Store";
    
        model.addAttribute("name", name);
        model.addAttribute("itemName", itemName);
        model.addAttribute("price", price);
        model.addAttribute("description", description);
        model.addAttribute("vendor", vendor);

        return "Index.jsp";
    }
}