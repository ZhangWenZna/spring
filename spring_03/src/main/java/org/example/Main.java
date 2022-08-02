package org.example;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.example.dao.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSourc = (DataSource) context.getBean("dataSoure");
        System.out.println(dataSourc);
        ComboPooledDataSource comboPooledDataSource = (ComboPooledDataSource) context.getBean("comboPooledDataSource");
        System.out.println(comboPooledDataSource);

        UserDao userDao =context.getBean(UserDao.class);
        userDao.save();
    }
}