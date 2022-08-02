package com.itzwz.dao.impl;

import com.itzwz.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {


    @Override
    public void save() {
        System.out.println("User Dao save...");
    }
}
