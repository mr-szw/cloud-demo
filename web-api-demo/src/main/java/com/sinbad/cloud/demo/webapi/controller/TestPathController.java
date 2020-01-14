package com.sinbad.cloud.demo.webapi.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/webApi")
public class TestPathController {


    @GetMapping(value = "/test")
    public String testPath(String test) {
        return "Hi " + test + "!";
    }

}
