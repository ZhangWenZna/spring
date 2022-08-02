package com.itzwz;

import com.itzwz.service.BookService;
import com.itzwz.service.UserService;
import com.itzwz.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext act=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) act.getBean("userService");
        userService.save();
    }
}
