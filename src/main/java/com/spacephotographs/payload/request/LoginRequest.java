package com.spacephotographs.payload.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

public class LoginRequest {
    @NotBlank @Getter @Setter
    private String username;

    @Getter @Setter
    @NotBlank
    private String password;
}