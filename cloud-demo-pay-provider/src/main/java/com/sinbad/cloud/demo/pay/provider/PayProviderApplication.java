package com.sinbad.cloud.demo.pay.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PayProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayProviderApplication.class, args);
	}

}
