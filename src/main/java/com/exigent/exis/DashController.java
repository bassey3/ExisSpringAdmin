package com.exigent.exis;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DashController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}

