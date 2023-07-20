package com.in28minutes.springboot.myfirstwebapp.login;


import com.in28minutes.springboot.myfirstwebapp.login.AuthenticationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Login {

    private AuthenticationService authenticationService;

    public Login(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String gotoLoginPage(){
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap modelMap){
        if (authenticationService.authenticate(name, password)) {
            modelMap.put("name", name);
            return "welcome";
        }
        modelMap.put("error", "Wrong password");
        return "login";
    }
}
