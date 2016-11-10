package com.dade.consume.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dade on 2016/11/10.
 */
@RestController
@RequestMapping("/api/v2/consumer")
public class UserController {

    @RequestMapping("/test")
    String test(){
        String res = "I'm Consumer!";
        return res;
    }


}
