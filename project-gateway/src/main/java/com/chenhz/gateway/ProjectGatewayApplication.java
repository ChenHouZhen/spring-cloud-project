package com.chenhz.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProjectGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectGatewayApplication.class, args);
    }

}
