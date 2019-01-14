package com.fyf.service;

public class Singleton2 {

    private final static Singleton2 instance = new Singleton2();

    private Singleton2() {
    }

    ;

    public Singleton2 getInstance() {
        return instance;
    }
}
