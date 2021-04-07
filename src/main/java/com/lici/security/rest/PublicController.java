package com.lici.security.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public/rest")
public class PublicController {
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome To Public Request";
	}

}
