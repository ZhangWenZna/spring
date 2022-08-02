package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    @Select("select * from user ;")
    List<User> userSelectAll();
    @Select("select *from user where id=#{id}")
    User userSelectById(int id);


}
