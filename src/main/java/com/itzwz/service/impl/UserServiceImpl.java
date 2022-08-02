package com.itzwz.service.impl;

import com.itzwz.dao.UserDao;
import com.itzwz.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("User Service save...");
        userDao.save();
    }
}
