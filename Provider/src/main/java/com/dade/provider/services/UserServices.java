package com.dade.provider.services;

import com.dade.providerApi.UserRpc;
import org.springframework.stereotype.Component;

/**
 * Created by Dade on 2016/11/10.
 */
@Component
public class UserServices implements UserRpc{

    public String getUserName(){
        String name = "Dade";
        return name;
    }

}
