package com.bobocode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class ParametrizedHelloController {

    @ResponseBody
    @RequestMapping
    public String helloQueryParam(@RequestParam(defaultValue = "Bobo") String name) {
        return "<h3>Hello, " + name + "</h3>";
    }

    @ResponseBody
    @RequestMapping("/{name}")
    public String helloPathVar(@PathVariable String name) {
        return "<h2>Hello, " + name + "</h2>";
    }
}
