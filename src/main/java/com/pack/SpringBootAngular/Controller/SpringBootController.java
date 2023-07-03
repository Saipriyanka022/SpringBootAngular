package com.pack.SpringBootAngular.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {
	@GetMapping("/www")
	public String  getMessage() {
		return "HelloWorld";
		
	}

}
