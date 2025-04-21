package com.harsh.spring.boot.concepts.appconfigs.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "greeting.config.coder")
@Data
@Component
public class GreetingsConfig {

    private String name;
    private int age;

}
