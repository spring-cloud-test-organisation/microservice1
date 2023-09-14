package com.microservice1.microservice1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${spring.profiles.active}")
    private String activeProfile;

    @GetMapping("/")
    public String hello() {
        return "Active profile: " + activeProfile + '\n';
    }
}
