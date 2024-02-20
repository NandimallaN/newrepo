package com.excelon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	   public String getMessage() {
		   return " Welcoem to rest service in docker";
	   }
}