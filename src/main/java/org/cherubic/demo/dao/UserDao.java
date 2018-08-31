package org.cherubic.demo.dao;

import org.cherubic.demo.entity.User;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface UserDao {
    
    List<User> listAll ();
}
