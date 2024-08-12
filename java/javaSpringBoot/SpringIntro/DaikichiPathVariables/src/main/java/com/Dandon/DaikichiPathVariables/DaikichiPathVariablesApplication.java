package com.Dandon.DaikichiPathVariables;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController 
@RequestMapping("/daikichi")
public class DaikichiPathVariablesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiPathVariablesApplication.class, args);
	}
	
	  @RequestMapping(value="/travel/{valueCity}", method=RequestMethod.GET)
	  //PathVariable annotation can be used to handle template variables in the request URI mapping,
	    public String city (@PathVariable ("valueCity") String valueCity ){
	      return "Congratulations You will soon travel to " + valueCity;
	    }
	
	  @RequestMapping(value="/lotto/{num}", method=RequestMethod.GET)
	  //PathVariable annotation can be used to handle template variables in the request URI mapping,
	    public String RandomSent (@PathVariable ("num") Integer  num ){
		  if ((num%2)==0 )
			  return "You will take a grand journey in the near future, but be weary of tempting offers" ;
		  else
			  return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
	    }
	

}
