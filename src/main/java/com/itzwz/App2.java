package com.itzwz;

import com.itzwz.config.SpringConfig;
import com.itzwz.dao.BookDao;
import com.itzwz.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        //BookDao bookDao=ctx.getBean(BookDao.class);
        //bookDao.save();
        BookService bookService =ctx.getBean(BookService.class);
        bookService.save();
    }
}
