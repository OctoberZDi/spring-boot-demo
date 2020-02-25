package com.xkcoding.template.enjoy.controller;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.StrUtil;
import com.xkcoding.template.enjoy.model.User;

import java.util.Map;

/**
 * @ProjectName: spring-boot-demo
 * @ClassName: TestHutool
 * @Description: 测试插件huTool
 * @Author: zhangdi
 * @Date: 2020年01月20日 11:17
 **/
public class TestHutool {

    public static void main(String[] args) {

        //
        System.out.println("测试BeanUtil");
        User user = User.builder().name("zhangdi").password("123456").build();

        Map<String, Object> stringObjectMap = BeanUtil.beanToMap(user);
        System.out.println(stringObjectMap);
        // test
        System.out.println("StrUtil");
        String s = StrUtil.appendIfMissing("2222", "4");
        System.out.println(s);

        System.out.println(StrUtil.format("你好，{}，我的名字叫{}，我今年{}岁了！", "tom", "zd", 21));
    }
}
