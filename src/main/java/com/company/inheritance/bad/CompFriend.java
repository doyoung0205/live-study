package com.company.inheritance.bad;

public class CompFriend { // 사회 친구
    private String name;
    private String job;
    private String phone;

    public CompFriend(String name, String job, String phone) {
        this.name = name;
        this.job = job;
        this.phone = phone;
    }

    public void showInfo() {
        System.out.println(this.toString());
//        System.out.println("이름: " + name + "\n" + "직업: " + job + "\n" + "전화: " + phone);
    }

    @Override
    public String toString() {
        return "CompFriend{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
