package com.company.generics.after;

public class FruitAndBox2 {
    public static void main(String[] args) {
        Box<Apple> aBox = new Box<>(); // T를 Apple 로 결정
        Box<Orange> oBox = new Box<>(); // T를 Orange 로 결정

        aBox.set(new Apple()); // 사과를 상자에 담는다.
        oBox.set(new Orange()); // 오렌지를 상자에 담는다.

        Apple ap = aBox.get(); // 사과를 꺼내는데 형 변환 하지 않는다.
        Orange or = oBox.get(); // 오렌지를 꺼내는데 형 변환 하지 않는다.

        System.out.println(ap); // I am a apple.
        System.out.println(or); // I am a orange.
    }
}
