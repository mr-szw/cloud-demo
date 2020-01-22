package com.sinbad.cloud.demo.config.client.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class GitController {
	
	@GetMapping(value = "show")
	public Object show() {
		return "gitConfig";
	}
	
	@GetMapping(value = "autoShow")
	public Object autoShow() {
		return "gitAutoRefreshConfig";
	}
}