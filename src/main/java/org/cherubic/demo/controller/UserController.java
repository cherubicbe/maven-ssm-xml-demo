package org.cherubic.demo.controller;

import org.cherubic.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    
    private final UserDao userDao;
    
    @Autowired
    public UserController (UserDao userDao) {
        this.userDao = userDao;
    }
    
    @GetMapping("/hello")
    public String listAll () {
        userDao.listAll().forEach(System.out::println);
        return "hello/index";
    }
}
