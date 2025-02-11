package com.cdac.netController.View.controller;

import com.cdac.netController.View.service.loginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/controller")
public class homeController {

    private static final Logger log = LoggerFactory.getLogger(homeController.class);

    @Autowired
    loginService loginservice;

    @GetMapping(value = "/home")
    public String showHome(){
        return "Home";
    }

    @GetMapping(value ="main")
    public String showMain(){
       return "";
    }



}
