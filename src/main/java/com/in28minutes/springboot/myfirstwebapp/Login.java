package com.in28minutes.springboot.myfirstwebapp;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Login {

    @RequestMapping("login")
    public String gotoLoginPage(){
        return "login";
    }
}
