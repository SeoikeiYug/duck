package com.genius.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DuckCloudGoodsAPI {

    @Value("${server.port}")
    private String applicationServerPort;

    @GetMapping("/goodsServerTest")
    public String goodsServerTest() {
        // 返回信息给调用端
        return "this is goodsService from port:" + applicationServerPort;
    }

}
