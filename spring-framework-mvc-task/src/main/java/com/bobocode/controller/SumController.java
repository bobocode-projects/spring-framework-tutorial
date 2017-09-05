package com.bobocode.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.function.BiFunction;

// todo: 1 - declare this class as Spring MVC controller
public class SumController {

    @Autowired // this bean is already configured in RootConfig.java
    private BiFunction<Integer, Integer, Integer> integerBiFunction;

    // todo: 2 - specify proper url mapping ('/sum/a/b', where a, and b is a pass variable)
    // todo: 3 - declare that this method provides a response body that should be returned to the client
    public String compute(@PathVariable Integer a, @PathVariable Integer b) {
        return a + " + " + b + " = " + integerBiFunction.apply(a, b);
    }
}
