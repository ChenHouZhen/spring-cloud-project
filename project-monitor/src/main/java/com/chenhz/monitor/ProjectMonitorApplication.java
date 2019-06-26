package com.chenhz.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class ProjectMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectMonitorApplication.class, args);
    }

}
