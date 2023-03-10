package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ming.li
 * @date 2023/3/10 14:25
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
//@EnableHystrix
public class EurekaConsumerMain {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerMain.class, args);
    }
}
