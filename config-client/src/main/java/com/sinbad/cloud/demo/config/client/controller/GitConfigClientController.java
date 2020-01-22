package com.sinbad.cloud.demo.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//用于刷新数据更新后会刷新注入的资源
@RefreshScope
@RestController
public class GitConfigClientController {
	
	
	@Value("${data.env}")
	private String dataEnv;
	
	
	@Value("${data.datasource.datasource-demo.username}")
	private String dataSourceDemoUserName;
	
	
	@GetMapping(value = "show")
	public Object show() {
		
		System.out.println("dataEnv " + dataEnv);
		
		return "gitConfig";
	}
	
	@GetMapping(value = "autoShow")
	public Object autoShow() {
		
		System.out.println("dataSourceDemoUserName " + dataSourceDemoUserName);
		
		return dataSourceDemoUserName;
	}
}