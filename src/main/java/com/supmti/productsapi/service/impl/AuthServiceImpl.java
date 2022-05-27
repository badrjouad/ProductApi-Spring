package com.supmti.productsapi.service.impl;

import com.supmti.productsapi.service.api.AuthServiceInterface;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthServiceInterface {
    @Override
    public boolean authUser(String login, String password) {

        return ("user").equals(login) && ("1231214").equals(password);
    }
}
