package com.example.constantdemo;

import com.example.constantdemo.config.Constant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = Constant.class)
public class ConstantdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConstantdemoApplication.class, args);
    }

}
