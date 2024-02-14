package com.example.eurekaclient.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {
    //http://localhost:8081/test
    @RequestMapping("/test")
    String display1(){
        return "hello world";
    }
    @Autowired
    RestTemplate restTemplate;

    //rest template is used for normal synchronous communication
    //http://localhost:8081/ms1
    @GetMapping("/ms1")
    public String display() {
        String microservice2Response = restTemplate.getForObject("http://eureka-client2:8082/ms2", String.class);
        return "Output from Microservice 1 & " + microservice2Response;
    }
}
