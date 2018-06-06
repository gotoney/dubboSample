package com.zeecle.web.impl;

import com.zeecle.web.api.UserService;
import com.zeecle.web.dao.UserDao;
import com.zeecle.web.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by towey on 2018/6/5.
 */
@Service("userService")
public class UserServiceImpl implements UserService {


    @Autowired
    UserDao userDao;

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }
}
