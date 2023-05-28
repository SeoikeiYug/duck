package com.genius.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("index")
    public String index(String params) {
        return "A-" + params;
    }

}
