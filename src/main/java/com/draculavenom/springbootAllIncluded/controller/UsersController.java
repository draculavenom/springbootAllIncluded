package com.draculavenom.springbootAllIncluded.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
	@GetMapping("")
	public String home() {
		return "<h1>Welcome</h1>";
	}
}
