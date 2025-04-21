package com.harsh.spring.boot.concepts.appconfigs.controller;

import com.harsh.spring.boot.concepts.appconfigs.service.GreetingConfigService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api/v1/config")
public class SpringBootConfigController {

    private final GreetingConfigService greetingConfigService;

    public SpringBootConfigController(GreetingConfigService greetingConfigService) {
        this.greetingConfigService = greetingConfigService;
    }

    @GetMapping("/hello")
    public String greetMe() {
        return greetingConfigService.getNameAndAge();

    }
}
