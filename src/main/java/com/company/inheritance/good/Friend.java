package com.company.inheritance.good;

public class Friend {
    protected String name;
    protected String phone;

    public Friend(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void showInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "name : " + name + "\n" + "phone : " + phone;
    }
}

