package com.bobocode.configs;

import com.bobocode.service.TalkingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AdditionalConfig {

    @Bean("talkingService")
    public TalkingService pythonFanService() {
        return () -> "Python is awesome!";
    }
}
