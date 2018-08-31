package org.cherubic.demo.entity;

public enum UserGender {
    
    Male("男"),
    Female("女");
    
    private String userGender;
    
    UserGender (String userGender) {
        this.userGender = userGender;
    }
    
    public String getValue () {
        return userGender;
    }
}
