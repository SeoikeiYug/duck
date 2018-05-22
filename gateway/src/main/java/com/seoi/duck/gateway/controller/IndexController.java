package com.seoi.duck.gateway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shuaiqi
 * @create 2018-05-22 19:26
 * @desc gateway Start
 **/
@RestController
public class IndexController {

    @Value("${from}")
    private String from;

    @GetMapping("/")
    public String index() {
        return from;
    }

}
