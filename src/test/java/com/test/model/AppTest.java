package com.test.model;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
//    @Autowired
//    UserMapper userMapper;
//
//    @Test
//    public void testSelect() {
//        System.out.println(("----- selectAll method test ------"));
//        List<User> userList = userMapper.selectList(null);
//        Assert.assertEquals(2, userList.size());
//        userList.forEach(System.out::println);
//    }

//    @Test
//    public void insertLoads() {
//        User user = new User();
//        user.setEmail("lqf@163.com");
//        user.setAge(12);
//
//        Integer insert = mapper.insert(user);
//        System.out.println("return insert value = " + insert);
//    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
