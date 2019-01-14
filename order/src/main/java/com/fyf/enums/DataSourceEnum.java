package com.fyf.enums;

public enum DataSourceEnum {
    DATA_SOURCE;
    private String name;

    private DataSourceEnum() {
        name = new String();
    }

    public String getName() {
        return name;
    }
}
