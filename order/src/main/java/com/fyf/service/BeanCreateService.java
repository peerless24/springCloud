package com.fyf.service;

public class BeanCreateService {

    public void init() {
        System.out.println("init(),在BeanCreateService bean初始化完之后执行。");
    }

    public BeanCreateService() {
        super();
        System.out.println("BeanCreateService bean的初始化构造函数。");
    }

    public void destroy() {
        System.out.println("destroy(),在BeanCreateService bean销毁后执行。");
    }
}
