package com.jonatas.qrmanager.DTOs;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;
}
