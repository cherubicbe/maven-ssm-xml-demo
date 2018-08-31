package org.cherubic.demo.service.impl;

import org.cherubic.demo.dao.UserDao;
import org.cherubic.demo.entity.User;
import org.cherubic.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    
    private final UserDao userDao;
    
    @Autowired
    public UserServiceImpl (UserDao userDao) {
        this.userDao = userDao;
    }
    
    @Override
    public List<User> listAll () {
        return userDao.listAll();
    }
}
