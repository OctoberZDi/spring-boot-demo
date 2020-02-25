package com.example.springbootdemohelloworld.data;

import lombok.Builder;
import lombok.Data;

/**
 * @ProjectName: spring-boot-demo
 * @ClassName: User
 * @Description: user类
 * @Author: zhangdi
 * @Date: 2020年02月15日 14:02
 **/
@Data
@Builder
public class User {
    private String name;
    private String password;
    private int age;
}
