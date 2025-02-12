package com.cdac.netController.View.Exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class NoSuchUserException extends RuntimeException {
        private String message;

}
