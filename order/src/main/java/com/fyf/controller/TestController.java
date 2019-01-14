package com.fyf.controller;

import com.fyf.config.BeanConfig;
import com.fyf.entity.UserInfo;
import com.fyf.enums.DataSourceEnum;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestController {

    public static void main(String[] args) {
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        //context.close();
        String a = DataSourceEnum.DATA_SOURCE.getName();
        String b = DataSourceEnum.DATA_SOURCE.getName();
        System.out.println(a == b);

        String c = new UserInfo().getUserName();
        String d = new UserInfo().getUserName();

        System.out.println(c == d);
    }
}
