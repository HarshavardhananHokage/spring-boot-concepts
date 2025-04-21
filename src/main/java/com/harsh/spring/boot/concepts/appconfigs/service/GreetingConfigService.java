package com.harsh.spring.boot.concepts.appconfigs.service;

import com.harsh.spring.boot.concepts.appconfigs.config.GreetingsConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GreetingConfigService {

    private final GreetingsConfig greetingsConfig;

    public GreetingConfigService(GreetingsConfig greetingsConfig) {
        this.greetingsConfig = greetingsConfig;
    }

    public String getNameAndAge() {
        return String.format("Hello %s. Your age is %d", greetingsConfig.getName(), greetingsConfig.getAge());
    }
}
