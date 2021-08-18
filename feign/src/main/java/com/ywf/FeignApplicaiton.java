package com.ywf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableFeignClients
public class FeignApplicaiton {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplicaiton.class,args);
    }
}
