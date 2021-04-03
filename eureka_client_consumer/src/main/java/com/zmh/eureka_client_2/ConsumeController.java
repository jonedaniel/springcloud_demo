package com.zmh.eureka_client_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumeController {
    @Autowired
    private ConsumerService consumerService;
    @Autowired
    private FeignClientService feignClientService;
    @Value("${var}")
    String var;

    @GetMapping("/consume")
    public Object consume() { return consumerService.consume() + var; }

    @GetMapping("/work")
    public Object work() {
        return feignClientService.work();
    }

}
