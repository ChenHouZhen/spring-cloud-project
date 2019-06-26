package com.chenhz.uac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProjectModulesUacApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectModulesUacApplication.class, args);
    }

}
