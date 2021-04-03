package com.zmh.eureka_client_consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-client-producer")
public interface FeignClientService {

    @GetMapping("work")
    String work();
}
