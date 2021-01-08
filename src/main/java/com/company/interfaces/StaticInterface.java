//package com.company.interfaces;
//
//public class StaticInterface {
//    public static void main(String[] args) {
//        User kor = new Korean();
//        String userType = User.getType();
//        String korType = kor.getType();    // 에러발생
//    }
//}
//
//
//class American implements User {
//    public void say() {
//        System.out.println("Hi!");
//    }
//}
//
//class Korean implements User {
//    public void say() {
//        System.out.println("안녕!");
//    }
//}
//
//interface User {
//    static String getType() {
//        return "Human";
//    }
//
//    void say();
//}
