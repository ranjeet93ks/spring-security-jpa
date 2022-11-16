package com.ranjs.springsecurity.springsecurityjpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@GetMapping("/")
	// for all
	public String home() {
		return ("<h1>Welcome!</h1>");
	}

	@GetMapping("/user")
	// for all user
	public String user() {
		return ("<h1>Welcome user!</h1>");
	}

	@GetMapping("/admin")
	// for admins
	public String admin() {
		return ("<h1>Welcome admin!</h1>");
	}

}
