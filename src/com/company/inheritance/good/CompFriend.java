package com.company.inheritance.good;

public class CompFriend extends Friend { // 사회 친구
    protected String job;

    public CompFriend(String name, String phone, String job) {
        super(name, phone);
        this.job = job;
    }

    @Override
    public void showInfo() {
//        System.out.println(super.toString());
//        System.out.println(this.toString());
        super.showInfo();
        System.out.println(super.toString());
    }

    @Override
    public String toString() {
        return "job : " + job;
    }
}
