package com.example.eurekaclient2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {
    //http://localhost:8080/ms2
    @GetMapping("/ms2")
    public String Microservice2Response() {
        return "Output from Microservice 2";
    }
}
