package com.example.springbootdemohelloworld.controller;

import com.example.springbootdemohelloworld.data.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: spring-boot-demo
 * @ClassName: UserController
 * @Description: 用户控制器
 * @Author: zhangdi
 * @Date: 2020年02月15日 14:03
 **/
@RestController
@RequestMapping(value = "user")
public class UserController {

    @RequestMapping(value = "index")
    public User index() {

        User user = User.builder().name("zhangdi").age(21).password("123456").build();

        return user;
    }
}
