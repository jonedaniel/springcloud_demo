package com.zmh.config_server_demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableConfigServer
@RestController
public class ConfigServerDemoApp {
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
        SpringApplication.run(ConfigServerDemoApp.class, args);
    }
}
