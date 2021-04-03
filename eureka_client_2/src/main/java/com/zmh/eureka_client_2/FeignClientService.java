package com.zmh.eureka_client_2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-client-1")
public interface FeignClientService {

    @GetMapping("work")
    String work();
}
