package com.exigent.exis;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DashController {
    @RequestMapping("/index")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    @RequestMapping("/restjaxgetstatus")
    public String restjaxgetstatus() {
        return "Status: OK.";
    }
}

