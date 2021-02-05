package com.amdocs.amdocshellorestapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class Hellocontroller {

	
	@GetMapping("hello")
	public String sayHello() {
		return "helloRest api";
		
	}
	
}
