package com.itzwz.dao.impl;

import com.itzwz.dao.BookDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {

    private int connnectionNum;
    private String databaseName;

    public void setConnnectionNum(int connnectionNum) {
        this.connnectionNum = connnectionNum;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public void save(){
        System.out.println("book dao save.....");
        System.out.println("databaseName:"+databaseName);
        System.out.println("connnectionNum"+connnectionNum);
    }
    //表示bean初始化对应的操作
    public void init(){
        System.out.println("init....");
    }
    //表示biean销毁前的操作
    public void destory(){
        System.out.println("destor....");
    }
}
