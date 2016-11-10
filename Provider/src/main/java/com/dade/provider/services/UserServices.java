package com.dade.provider.services;

import com.dade.providerApi.UserRpc;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Dade on 2016/11/10.
 */
@Service("userServices")
public class UserServices implements UserRpc{

    public String getUserName(){
        String name = "Dade";
        return name;
    }

}
