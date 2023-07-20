package com.in28minutes.springboot.myfirstwebapp;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hello! how is your day going?";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloToHTML(){
        StringBuffer sb = new StringBuffer();
        sb.append("<!DOCTYPE html>");
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>Document</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1>Main Page</h1>");
        sb.append("</body>");
        sb.append("</html>");


        return sb.toString();
    }

    @RequestMapping("say-hello-jsp")
    public String sayHelloJSP(){
        return "sayHello";
    }


}
