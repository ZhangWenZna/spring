package org.example;

import org.example.config.SpringConfig;
import org.example.dao.UserDao;
import org.example.pojo.User;
import org.example.service.UserService;
import org.example.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        UserDao userDao=  context.getBean(UserDao.class);
        //List<User> users=userDao.userSelect();
        List<User> users=userDao.userSelectAll();
        System.out.println(users);
    }
}