package com.cdac.netController.View.controller;

import com.cdac.netController.View.dto.UserDto;
import com.cdac.netController.View.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class HomeController {

    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    LoginService loginservice;

    @GetMapping(value = "/home")
    public String showHome(){
        return "Home";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }


    @PostMapping("/validate")
    public String validate(@ModelAttribute UserDto user, Model model, RedirectAttributes redirectAttributes){
        log.info("username {} and password {}",user.getUsername(),user.getPassword());
        String response =loginservice.validateUser(user);
        if ("success".equals(response)) {
            return "redirect:/MainPage";
        } else {
            redirectAttributes.addAttribute("error", "Invalid Email or Invalid password");
            return "redirect:/login";
        }

    }



}
