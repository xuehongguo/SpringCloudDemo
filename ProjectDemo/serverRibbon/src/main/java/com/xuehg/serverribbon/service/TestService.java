package com.xuehg.serverribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String testService(String name){
        return restTemplate.getForObject("http://service-client/home?name = "+name,String.class);
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }


}
