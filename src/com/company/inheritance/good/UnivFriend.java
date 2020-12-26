package com.company.inheritance.good;

public class UnivFriend extends Friend { // 대학 친구
    protected String major; //전공

    public UnivFriend(String name, String phone, String major) {
        super(name, phone);
        this.major = major;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(super.toString());
    }

    @Override
    public String toString() {
        return "major : " + major;
    }
}
