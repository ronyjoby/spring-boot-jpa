package com.springboot.buildingblocks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/hello-bean")
	public UserDetails helloBean(){
		return new UserDetails("Rony", "Mathew", "Kottayam");
	}

}
