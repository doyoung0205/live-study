package com.company.generics.before;

public class FruitAndBox3 {

    public static void main(String[] args) {
        Box aBox = new Box(); // 시과 상자 생성
        Box oBox = new Box(); // 오렌지 박스 생성

        // 사과와 오렌지가 아닌 문자열을 담았다.
        aBox.setOb("apple");
        oBox.setOb("orange");

        // 상자에 과일이 담기지 않았는데, 과일을 꺼내려 한다.
        Apple ap = (Apple) aBox.getOb();
        Orange or = (Orange) oBox.getOb();

        System.out.println(ap);
        System.out.println(or);
    }
}

