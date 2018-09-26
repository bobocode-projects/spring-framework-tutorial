package com.bobocode.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping
    public String welcome() {
        return "<h1 style='text-align:center'>Welcome to Spring REST example</h1>";
    }

}
