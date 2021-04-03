package com.zmh.bus_server_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BusServerApp {
    public static void main(String[] args) {
        SpringApplication.run(BusServerApp.class, args);
    }
}
