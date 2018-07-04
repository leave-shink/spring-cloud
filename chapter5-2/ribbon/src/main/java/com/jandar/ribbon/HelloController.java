package com.jandar.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hi(name);
    }

    @GetMapping(value = "/test")
    public String test(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://www.baidu.com/",String.class);
    }

    @Autowired
    LoadBalancerClient loadBalancerClient;
    @GetMapping(value = "/testRibbon")
    public String testRibbon(){
        ServiceInstance instance =loadBalancerClient.choose("abc");
        return instance.getHost()+":"+instance.getPort();
    }


}
