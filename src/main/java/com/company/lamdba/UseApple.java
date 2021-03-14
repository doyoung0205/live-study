package com.company.lamdba;

import java.util.Comparator;

public class UseApple {
    public static void main(String[] args) {

        // 익명 클래스
        Comparator<Apple> byWeight = new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWight().compareTo(o2.getWight());
            }
        };

        // lambda
//        Comparator<Apple> byWeight = (o1, o2) -> o1.getWight().compareTo(o2.getWight());
    }

}
