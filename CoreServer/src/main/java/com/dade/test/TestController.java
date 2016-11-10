package com.dade.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dade on 2016/11/10.
 */
@RestController
@RequestMapping("/api/v1/test")
public class TestController {

    @RequestMapping(value = "/hello_spring_boot", method = RequestMethod.GET)
    String sayHello(){
        String word = "Hello Spring Boot!";
        return word;
    }

}
