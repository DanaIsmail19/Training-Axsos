package com.dandon.DaikichiRoutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController 
@RequestMapping("daikici")
public class DaikichiRoutesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiRoutesApplication.class, args);
	}
	
	 @RequestMapping("")
	    public String daikici(){
	      return "Welcome!";
	    }
	
	    @RequestMapping("/today")
	    public String today(){
	      return "Today ypu will find luck in all your endeavors!";
	    }
	    @RequestMapping("/tomorrow")
	    public String tomorrow(){
	      return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	    }
	}


 