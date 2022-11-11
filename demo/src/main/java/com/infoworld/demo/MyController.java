package com.infoworld.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping(value="/")
    public String getMethodName(@RequestParam(required = false) String param) {
        return "test";
    }
}
