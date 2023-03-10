package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ming.li
 * @date 2023/3/10 14:04
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaProducerMain {
    public static void main(String[] args) {
        SpringApplication.run(EurekaProducerMain.class,args);
    }
}
