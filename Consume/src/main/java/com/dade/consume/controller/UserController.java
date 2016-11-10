package com.dade.consume.controller;

import com.dade.providerApi.UserRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Dade on 2016/11/10.
 */
@RestController
@RequestMapping("/api/v2/consumer")
public class UserController {

    @Resource
    UserRpc userRpc;

    @RequestMapping("/test")
    String test(){
        String res = "I'm Consumer!";
        return res;
    }

    @RequestMapping("/bubbo")
    String bizDubbo(){
        String res = userRpc.getUserName();
        return res;
    }



}
