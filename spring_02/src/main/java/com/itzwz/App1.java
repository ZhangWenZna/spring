package com.itzwz;

import com.itzwz.dao.BookDao;
import com.itzwz.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
    public static void main(String[] args) {
        //获取Ioc容器
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取bean
        BookDao bookDao = (BookDao)ctx.getBean("bookDao");
        bookDao.save();


        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();

        ctx.close();
    }
}
