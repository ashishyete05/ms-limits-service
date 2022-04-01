package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.configuration.LimitsConfig;
import com.example.demo.bean.Limit;

@RestController
public class LimitsController {

	@Autowired
	LimitsConfig config;
	
	@GetMapping("/limits")
	public Limit retreiveLimitsProps() {
		
		return new Limit(config.getMinimum(), config.getMaximum());
	}
	
}
