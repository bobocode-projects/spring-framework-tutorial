package com.bobocode.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/hello")
public class ParametrizedHelloController {

    @ResponseBody
    @GetMapping
    public String helloQueryParam(@RequestParam(defaultValue = "Bobo") String name) {
        return "<h3>Hello, " + name + "</h3>";
    }
}
