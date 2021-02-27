package com.company.generics.before;

public class FruitAndBox4 {

    public static void main(String[] args) {
        Box aBox = new Box(); // 시과 상자 생성
        Box oBox = new Box(); // 오렌지 박스 생성

        // 사과와 오렌지가 아닌 문자열을 담았다.
        // 프로그래머의 실수
        aBox.setOb("apple");
        oBox.setOb("orange");

        System.out.println(aBox.getOb()); // apple 출력
        System.out.println(oBox.getOb()); // orange 출력
    }
}

