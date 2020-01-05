package com.syscho.spring.bookmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BookController {

	
	@GetMapping({"/","index.html"})
	public String index() {
		return "homePage";
	}
}
