package com.cdac.netController.serviceImpl;

import com.cdac.netController.dto.LoginDto;
import org.springframework.stereotype.Service;

@Service
public class loginService {

    public LoginDto validate(LoginDto logindto) {
        LoginDto dto = new LoginDto();
        if (logindto !=null) {
            if (!logindto.getUsername().isEmpty() && !logindto.getPassword().isEmpty()) {
                if (logindto.getUsername().equals("user") && logindto.getPassword().equals("admin")) {
                    dto.setStatus("Success");
                } else {
                    dto.setStatus("Failed");
                }
            } else {
                dto.setStatus("No input");
            }
        }
        return dto;
    }
}
