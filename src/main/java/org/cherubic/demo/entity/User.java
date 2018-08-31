package org.cherubic.demo.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class User {
    
    private Integer userId;
    private String userName;
    private String userPassword;
    private LocalDate userBirthDate;
    private UserGender userGender;
}
