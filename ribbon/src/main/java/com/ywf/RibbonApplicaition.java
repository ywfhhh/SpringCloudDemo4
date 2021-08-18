package com.ywf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RibbonApplicaition {
    public static void main(String[] args) {
        SpringApplication.run(RibbonApplicaition.class,args);
    }
    @Bean
    @LoadBalanced //该注释实现负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
