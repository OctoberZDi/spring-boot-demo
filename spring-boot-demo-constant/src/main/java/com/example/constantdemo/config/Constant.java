package com.example.constantdemo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @ProjectName: spring-boot-demo
 * @ClassName: Constant
 * @Description: 测试常量类的实现
 * @Author: zhangdi
 * @Date: 2020年02月07日 10:40
 **/
@Data
@Configuration
@ConfigurationProperties(prefix = "display.html")
@PropertySource("classpath:constant/constant.properties")
public class Constant {
    private String index;
    private String displayItem;
}
