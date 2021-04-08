package com.sinbad.cloud.demo.order.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class OrderConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderConsumerApplication.class, args);
	}

}
