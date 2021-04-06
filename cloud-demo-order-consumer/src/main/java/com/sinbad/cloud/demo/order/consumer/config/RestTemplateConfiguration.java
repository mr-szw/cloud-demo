package com.sinbad.cloud.demo.order.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author sinbad on 2021/4/6.
 */
@Configuration
public class RestTemplateConfiguration {


	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
