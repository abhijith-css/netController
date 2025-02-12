package com.cdac.netController.View.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    String username;
    String password;
    String error;
}
