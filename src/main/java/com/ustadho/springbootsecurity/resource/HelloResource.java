package com.ustadho.springbootsecurity.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {
    @GetMapping("hello")
    private String hello() {
        return "Hello World!";
    }
}
