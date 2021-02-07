package com.company.annotaions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Hello
public class HelloController {

    private static final String hello = "hello";

    @GetMapping(hello)
    public String hello () {
        return "hello";
    }
}
