package org.example.dao.impl;

import org.example.dao.BookDao;
import org.springframework.stereotype.Component;

@Component
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("book dao save....");
        }
    }

    @Override
    public void update() {
        System.out.println("book dao update....");
    }
}
