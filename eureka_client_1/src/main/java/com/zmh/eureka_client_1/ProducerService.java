package com.zmh.eureka_client_1;

import org.springframework.stereotype.Service;

@Service
public class ProducerService {
    public Object work() {
        return "this is producer "+System.currentTimeMillis();
    }
}
