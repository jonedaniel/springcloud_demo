package com.zmh.eureka_client_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumeController {
    @Autowired
    private ConsumerService consumerService;
    @Autowired
    private FeignClientService feignClientService;

    @GetMapping("/consume")
    public Object consume() { return consumerService.consume(); }

    @GetMapping("/work")
    public Object work() {
        return feignClientService.work();
    }

}
