package com.cdac.netController.controller;
import com.cdac.netController.dto.LoginDto;
import com.cdac.netController.serviceImpl.loginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/home")
public class homeController {

    private static final Logger log = LoggerFactory.getLogger(homeController.class);

    @Autowired
    loginService loginService;

    @GetMapping(value = "/start")
    public String showHome(){
        return "Home";
    }

    @PostMapping(value = "/login")
    public LoginDto login(@RequestParam String username, @RequestParam String password){
        log.info("username {} and password {}",username,password);
        LoginDto loginDto=new LoginDto();
        loginDto.setPassword(password);
        loginDto.setUsername(username);
        return loginService.validate(loginDto);
    }



}
