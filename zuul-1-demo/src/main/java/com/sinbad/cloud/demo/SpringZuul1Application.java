package com.sinbad.cloud.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
//开启zuul代理
@EnableZuulProxy
public class SpringZuul1Application {


    public static void main(String[] args) {
        SpringApplication.run(SpringZuul1Application.class, args);
    }
}
