package org.example.service;


import org.example.config.SpringConfig;
import org.example.dao.UserDao;
import org.example.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class UserServiceTest {
    /**
     *
     */
    @Autowired
    private UserService userService;
   // @Autowired
    //UserDao userDao;

    @Test
    public void TestById(){
        User user=userService.userSelectById(2);
        //userService.save();
        System.out.println(user);

    }

    @Test
    public void TestSelectAll(){
        userService.selectAll();
    }
}
