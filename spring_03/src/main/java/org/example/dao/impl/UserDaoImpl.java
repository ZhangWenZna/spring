package org.example.dao.impl;

import org.example.dao.UserDao;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao {
    private String userName;

    @Override
    public void save() {
        System.out.println("用户名："+userName);
    }

    public void setUserName(String userName) {
        this.userName=userName;
    }
}
