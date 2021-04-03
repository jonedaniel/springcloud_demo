package com.zmh.config_server_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerDemoApp {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerDemoApp.class, args);
    }
}
