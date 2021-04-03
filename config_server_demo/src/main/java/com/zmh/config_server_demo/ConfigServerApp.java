package com.zmh.config_server_demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
@RestController
@RefreshScope
public class ConfigServerApp {
    @Value("${git_username}")
    String username;
    @Value("${git_password}")
    String password;

    @GetMapping("git")
    public Object git() {
        System.out.println(username + " "+password);
        return "git";
    }
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApp.class, args);
    }
}
