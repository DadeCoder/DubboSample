package com.dade;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dade on 2016/11/10.
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @RequestMapping(value = "/get_user", method = RequestMethod.GET)
    User getUser(){
        User user = new User();
        user.setName("Dade");
        user.setId("000");
        user.setAge(24);
        return user;
    }

}
