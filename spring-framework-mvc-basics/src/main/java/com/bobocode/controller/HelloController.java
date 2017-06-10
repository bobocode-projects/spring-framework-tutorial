package com.bobocode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({"/", "/hello"})
public class HelloController {

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public String hello() {
        return "<h1>Hello, Bobo!</h1>";
    }
}
