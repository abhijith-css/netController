package com.cdac.netController.View.controller;

import com.cdac.netController.View.dto.UserDto;
import com.cdac.netController.View.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class HomeController {

    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    LoginService loginservice;

    @GetMapping(value = "/home")
    public String showHome(){
        return "Home";
    }

    @GetMapping(value ="/main")
    public String showMain(){
       return "";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/index")
    public String index(){
        return "index";
    }
    @PostMapping("/validate")
    public String validate(@ModelAttribute UserDto user, Model model){
        String response =loginservice.validateUser(user);
        model.addAttribute("user", user);
        return "login";
    }



}
