package org.example.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.example.pojo.User;

import java.util.List;
public interface UserMapper {
    @Select("select * from user;")
    List<User> userSelectAll();

    @Select("select * from user where id=#{id}")
    User userSelectById(int id);


}
