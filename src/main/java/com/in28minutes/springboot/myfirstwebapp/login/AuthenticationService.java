package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password){
        boolean isValidUser = username.equalsIgnoreCase("Norman");
        boolean isValidPassword = password.equalsIgnoreCase("dummy");

        return isValidUser && isValidPassword;
    }
}
