package com.sparta.springcore.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SignupRequestDto {
    private String username;
    private String password;
    private String email;
    // 관리자 여부
    private boolean admin = false;
    // 관리자 토큰
    private String adminToken = "";
}
