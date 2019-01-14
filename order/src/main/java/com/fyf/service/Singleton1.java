package com.fyf.service;

public class Singleton1 {

    private Singleton1 instance = null;

    private Singleton1() {
    }

    ;

    public Singleton1 getInstance() {
        if (null == instance) {
            instance = new Singleton1();
        }
        return instance;
    }
}
