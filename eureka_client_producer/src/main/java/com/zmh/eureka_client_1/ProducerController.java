package com.zmh.eureka_client_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
    @Autowired
    private ProducerService producerService;

    @GetMapping("/work")
    public Object work() {
        return producerService.work();
    }

    @Value(value = "${var}")
    public String var = "";

    @GetMapping("/var")
    public Object var() {
        return var;
    }
}
