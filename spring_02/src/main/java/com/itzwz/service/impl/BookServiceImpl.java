package com.itzwz.service.impl;

import com.itzwz.dao.BookDao;
import com.itzwz.service.BookService;

public class BookServiceImpl implements BookService {
    //BookDao bookDao=new BookDaoImpl();不可留
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
