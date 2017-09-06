package com.bobocode.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "com.bobocode.web.controller")
@EnableWebMvc
public class WebConfig {

    //todo: configure view resolver for JSP pages

}
