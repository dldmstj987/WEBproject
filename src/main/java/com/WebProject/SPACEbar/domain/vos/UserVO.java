package com.WebProject.SPACEbar.domain.vos;

import com.WebProject.SPACEbar.domain.enums.UserRole;

import lombok.*;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotBlank;


@Data
@RequiredArgsConstructor
public class UserVO {
    @NotBlank
    private String Email;
    @NotBlank
    private String password;
    @NotBlank
    private String id;
    @NotBlank
    private String birth;
    @NotBlank
    private String phone;

    private UserRole role;

}
