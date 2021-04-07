package com.lici.security.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rest")
public class MyController {
	 @GetMapping("/helloworld")
	    public String helloworld() {
	        return "Hello World";
	    }

}
