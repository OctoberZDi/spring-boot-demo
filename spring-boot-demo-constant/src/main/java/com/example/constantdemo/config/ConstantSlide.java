package com.example.constantdemo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

/**
 * @ProjectName: spring-boot-demo
 * @ClassName: ConstantSlide
 * @Description: ddd
 * @Author: zhangdi
 * @Date: 2020年02月07日 11:01
 **/
@Data
@Configuration
@ConfigurationProperties(prefix = "com.slide")
@PropertySource("classpath:constant/constant.yml")
public class ConstantSlide {

    private String name;
    private int age;
    private List<SlideInfo> slideInfos;
}
