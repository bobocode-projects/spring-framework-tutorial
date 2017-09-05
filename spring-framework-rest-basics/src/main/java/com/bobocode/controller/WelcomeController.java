package com.bobocode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

    @GetMapping("/")
    @ResponseBody
    public String welcome() {
        return "<h1 style='text-align:center'>Welcome to Spring REST example</h1>";
    }

}
