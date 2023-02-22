package com.securityjpa.demojpa.controller;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ControllerJPA {
	
	@GetMapping("/home")
	public String home() {
		return "<h1> WELCOME </h1>";
	}
	
	@GetMapping("/user")
	public String user() {
		return "<h1> WELCOME user </h1>";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "<h1> WELCOME admin </h1>";
	}
	
}
