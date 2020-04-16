package com.xuehg.serverribbon.controller;


import com.xuehg.serverribbon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @Autowired
    TestService service;

    @GetMapping("/hi")
    @ResponseBody
    public String test(@RequestParam String name) {
        return service.testService(name);
    }

    @ResponseBody
    @RequestMapping("/test1")
    public String get() {
        return "hello ribbon";
    }
}
