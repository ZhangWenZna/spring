package com.itzwz.service.impl;

import com.itzwz.dao.BookDao;
import com.itzwz.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bookService")
public class BookServiceImpl implements BookService {
    //BookDao bookDao=new BookDaoImpl();不可留
    @Autowired
    BookDao bookDao;
    //提供set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save(){
        System.out.println("book service save....");
        bookDao.save();
    }
}
