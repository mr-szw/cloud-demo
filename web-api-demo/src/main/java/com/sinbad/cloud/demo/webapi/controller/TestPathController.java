package com.sinbad.cloud.demo.webapi.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/webApi")
public class TestPathController {
	
	
	private static final Logger logger = LoggerFactory.getLogger(TestPathController.class);
	
	@GetMapping(value = "/test")
	public String testPath(String test) {
		logger.info("Test param = {}", test);
		return "Hi " + test + "!";
	}
	
}
