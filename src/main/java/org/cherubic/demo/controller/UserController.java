package org.cherubic.demo.controller;

import org.cherubic.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    
    private final UserService userService;
    
    @Autowired
    public UserController (UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping("/hello")
    public String listAll () {
        userService.listAll().forEach(System.out::println);
        return "hello/index";
    }
}
