package com.ntg.organization.organization.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping(value = "/")
    public String printHello() {
        return "Hello Spring boot";


    }

    @GetMapping(value = "/p2")
    public String printHello2() {
        return "Hello Spring boot 2";
    }

}
