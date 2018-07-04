package com.jandar.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hi(String name){
        return restTemplate.getForObject("http://ABC/hi?name=" + name, String.class);
    }

}
