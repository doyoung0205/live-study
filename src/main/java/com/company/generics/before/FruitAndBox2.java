package com.company.generics.before;

public class FruitAndBox2 {

    public static void main(String[] args) {
        Box aBox = new Box(); // 시과 상자 생성
        Box oBox = new Box(); // 오렌지 박스 생성

        aBox.setOb(new Apple()); // 사과를 사과 상자에 담는다.
        oBox.setOb(new Orange()); // 오렌지를 오렌지 상자에 담는다.

        Apple ap = (Apple) aBox.getOb(); // 상자에서 사과를 꺼낸다.
        Orange or = (Orange) oBox.getOb(); // 상자에서 오렌지를 꺼낸다.

        System.out.println(ap);
        System.out.println(or);
    }
}

