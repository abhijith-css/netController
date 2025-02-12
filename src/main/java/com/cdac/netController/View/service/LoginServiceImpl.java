package com.cdac.netController.View.service;

import com.cdac.netController.View.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {


    @Override
    public String validateUser(UserDto user){

            if (user.getUsername().equals("admin") && user.getPassword().equals("admin")) {
                return "success";
            } else {
                return "failed";
            }
    }
}