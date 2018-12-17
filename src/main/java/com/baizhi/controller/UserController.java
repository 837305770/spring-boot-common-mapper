package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserMapper userMapper;
   /* @RequestMapping("/test")
    public void test(){
        List<User> list = userMapper.selectAll();
        for (User user : list) {
            System.out.println(user);
        }*/
        @RequestMapping("/test1")
        public void test1(){
            int i = userMapper.deleteByPrimaryKey("11");
            System.out.println(i);
        }
}
