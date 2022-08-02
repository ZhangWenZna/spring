package org.example.service;

import org.example.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {

    List<User> selectAll();
    User userSelectById(int id);

}
