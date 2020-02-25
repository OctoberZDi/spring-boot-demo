package com.example.constantdemo.controller;

import com.example.constantdemo.config.Constant;
import com.example.constantdemo.config.ConstantSlide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: spring-boot-demo
 * @ClassName: ConstantController
 * @Description: 测试常量类的获取
 * @Author: zhangdi
 * @Date: 2020年02月07日 10:46
 **/
@RestController
@RequestMapping(value = "cons")
public class ConstantController {

    @Autowired
    private Constant constant;
    @Autowired
    private ConstantSlide constantSlide;

    @RequestMapping(value = "test")
    public String test() {
        return "Test" + constant.getDisplayItem() + constant.getIndex();
    }

    @RequestMapping(value = "test2")
    public String test2() {
        return "Test2" + constantSlide.getSlideInfos().get(0).getId() + constantSlide.getSlideInfos().get(0).getName();
    }
}
