package com.bobocode.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

    @ResponseBody
    @GetMapping
    public String hello() {
        return "\n" +
                "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Welcome to Bobocode!</title>\n" +
                "</head>\n" +
                "<body align=\"center\">\n" +
                "<p style=\"font-size: 72px; margin-top: 10%\">Welcome to</p>\n" +
                "<div>\n" +
                "    <img src=\"https://raw.githubusercontent.com/bobocode-projects/resources/master/image/bobo_logo.png\" style=\"width: 60%\"/>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>";
    }
}
