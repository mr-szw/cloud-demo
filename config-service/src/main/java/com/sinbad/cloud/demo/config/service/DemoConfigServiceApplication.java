package com.sinbad.cloud.demo.config.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class DemoConfigServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DemoConfigServiceApplication.class, args);
	}
	
}
