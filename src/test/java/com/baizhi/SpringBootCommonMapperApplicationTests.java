package com.baizhi;

import com.baizhi.entity.User;
import com.baizhi.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootCommonMapperApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Test
    public void test() {
        List<User> list = userMapper.selectAll();
        for (User user : list) {
            System.out.println(user);
        }
    }
    @Test
    public void test1() {
        User user = userMapper.selectByPrimaryKey("lisi");
        System.out.println(user);
    }
    @Test
    public void test2() {
        User user = new User();
        user.setUsername("zhangsan");
        user.setPassword("123456");
        user.setStatue("222");
        List<User> list = userMapper.select(user);
        for (User user1 : list) {
            System.out.println(user1);
        }
    }
    @Test
    public void test3() {
        int i = userMapper.selectCount(new User());
        System.out.println(i);
    }
    @Test
    public void test4() {
        int i = userMapper.deleteByPrimaryKey("zhangsan");
        System.out.println(i);
    }
    @Test
    public void test5() {
         User user = new User("lisi","555555");
           userMapper.updateByPrimaryKey(user);
    }
}

