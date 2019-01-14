package com.fyf.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250BeanCreateService {

    @PostConstruct
    public void init() {
        System.out.println("init(),在JSR250BeanCreateService bean初始化完之后执行。");
    }

    public JSR250BeanCreateService() {
        super();
        System.out.println("JSR250BeanCreateService bean的初始化构造函数。");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy(),在JSR250BeanCreateService bean销毁后执行。");
    }
}
