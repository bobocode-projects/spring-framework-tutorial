package com.bobocode.configs;

import com.bobocode.service.TalkingService;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.bobocode.service")
@ImportResource("classpath:application-context.xml")
@Import(AdditionalConfig.class)
public class MainConfig {

    @Bean("talkingService")
    public TalkingService javaFanService() {
        return () -> "Java is the best!";
    }
}
