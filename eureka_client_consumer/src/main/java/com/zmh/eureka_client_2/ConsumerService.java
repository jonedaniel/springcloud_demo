package com.zmh.eureka_client_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    public Object consume() {
        return "this is consumer";
    }


}
