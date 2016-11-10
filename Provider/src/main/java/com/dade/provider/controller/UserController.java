package com.dade.provider.controller;

import com.dade.provider.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dade on 2016/11/10.
 */
@RestController
@RequestMapping("/api/v2/controller")
public class UserController {

    @Autowired
    UserServices userServices;

    @RequestMapping("/test")
    String test(){
        String res = "I'm Provider!";
        return res;
    }

    @RequestMapping("/services")
    String getName(){
        String name = userServices.getUserName();
        return name;
    }

}
