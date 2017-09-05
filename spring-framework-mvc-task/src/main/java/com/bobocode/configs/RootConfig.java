package com.bobocode.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.function.BiFunction;

@Configuration
@ComponentScan(basePackages = "com.bobocode", excludeFilters = {
        @Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class),
        @Filter(type = FilterType.ANNOTATION, value = Controller.class)
})
public class RootConfig {
    @Bean
    public BiFunction<Integer, Integer, Integer> sumFunction() {
        return (a, b) -> a + b;
    }
}
