package com.cdac.netController.View.service;

import com.cdac.netController.View.dto.UserDto;

public interface LoginService {


    String validateUser(UserDto user);
}
