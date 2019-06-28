package com.example.helloworld.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testService")
public class TestController {

    @RequestMapping(method = RequestMethod.GET)
    public String test() {
        return "Hello World Test!";
    }
}
