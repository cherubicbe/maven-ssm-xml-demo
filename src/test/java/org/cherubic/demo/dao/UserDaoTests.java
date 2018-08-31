package org.cherubic.demo.dao;

import org.cherubic.demo.ApplicationTests;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

class UserDaoTests extends ApplicationTests {
    
    @Autowired
    private UserDao userDao;
    
    @Test
    void testListAll () {
        userDao.listAll().forEach(System.out::println);
    }
}
