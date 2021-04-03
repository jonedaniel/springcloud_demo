package com.zmh.eureka_client_consumer;

import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    public Object consume() {
        return "this is consumer";
    }


}
