package com.ywf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zipkin")
public class ZipkinClientHandler {
    @Value("${server.port}")
    private String port;
    @GetMapping("/index")
    public String index(){
        return "当前端口为:"+port;
    }
}
