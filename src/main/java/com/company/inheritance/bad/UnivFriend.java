package com.company.inheritance.bad;

public class UnivFriend { // 대학 친구
    private String name;
    private String major; //전공
    private String phone;

    public UnivFriend(String name, String major, String phone) {
        this.name = name;
        this.major = major;
        this.phone = phone;
    }

    public void showInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "UnivFriend{" +
                "name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
