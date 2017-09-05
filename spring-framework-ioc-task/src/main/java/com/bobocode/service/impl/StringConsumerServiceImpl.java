package com.bobocode.service.impl;

import com.bobocode.service.StringConsumerService;

import java.util.function.Consumer;

//todo: 1 - specify that Spring should create an instance(bean) of this class
public class StringConsumerServiceImpl implements StringConsumerService {

    //todo: 2 - ask spring to inject this dependency
    private Consumer<String> stringConsumer;

    @Override
    public void consume(String value) {
        stringConsumer.accept(value);
    }

}
