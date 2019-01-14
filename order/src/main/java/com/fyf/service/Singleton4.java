package com.fyf.service;

public class Singleton4 {

    public Singleton4() {
    }

    private static class Create {
        private static Singleton4 instance = new Singleton4();
    }

    private Singleton4 getInstance() {
        return Create.instance;
    }
}
