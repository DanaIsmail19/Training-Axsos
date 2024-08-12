package com.dandon.saveTravels.controler;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dandon.saveTravels.models.TravelModel;
import com.dandon.saveTravels.services.TravelService;

@Controller
public class TravelController {
	@Autowired
	private TravelService travelService;
	 @GetMapping("/travel")
	    public String viewExpenses(Model model) {
	        List<TravelModel> travel = travelService.findAllTravel();
	        model.addAttribute("travel", travel);
	        return "travel.jsp";
	    }
	 
	   @GetMapping("/travel/add")
	    public String addTravel(Model model) {
	        model.addAttribute("travel", new TravelModel());
	        return "addTravel.jsp"; 
	    }
	   
	   @PostMapping("/travel/save")
	    public String saveTravel(@ModelAttribute TravelModel travel) {
	        travelService.save(travel);
	        return "redirect:/travel.jsp"; 
	    }

	    @GetMapping("/travel/edit/{id}")
	    public String editTravel(@PathVariable("id") Long id, Model model) {
	    	TravelModel travel = travelService.findById(id);
	        model.addAttribute("travel", travel);
	        return "editTravel.jsp";
	    }

	    @PostMapping("/travel/update/{id}")
	    public String updateTravel(@PathVariable("id") Long id, @ModelAttribute TravelModel updatedTravel) {
	        travelService.updateTravel(id, updatedTravel);
	        return "redirect:/travel.jsp"; 
	    }

	    @GetMapping("/travel/delete/{id}")
	    public String deleteTravel(@PathVariable("id") Long id) {
	        travelService.deleteTravel(id);
	        return "redirect:/travel.jsp"; 
	    }

}