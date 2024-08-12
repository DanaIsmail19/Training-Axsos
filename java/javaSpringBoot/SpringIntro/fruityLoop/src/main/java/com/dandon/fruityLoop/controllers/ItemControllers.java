package com.dandon.fruityLoop.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.dandon.fruityLoop.models.items;

@Controller
public class ItemControllers
{
	 @RequestMapping("/")
	    public String index(Model model) {

	        ArrayList<items> fruits = new ArrayList<>();
	        fruits.add(new items("Kiwi", 1.5));
	        fruits.add(new items("Mango", 2.0));
	        fruits.add(new items("Goji Berries", 4.0));
	        fruits.add(new items("Guava", 0.75));

	        model.addAttribute("fruits", fruits);
	 
	 
	        return "index.jsp";
	 }
	 
}
