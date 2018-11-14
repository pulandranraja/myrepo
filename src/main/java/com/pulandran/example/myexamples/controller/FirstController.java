package com.pulandran.example.myexamples.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @RequestMapping("/testing")
    public String first() {
        return String.format("First Controller");
    }
}
