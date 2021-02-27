package com.company.generics.after;

public class PrimitivesAndGeneric {
    public static void main(String[] args) {
        Box<Integer> iBox = new Box<>();
        iBox.set(123); // 오토 박싱 진행
        int num = iBox.get();
        System.out.println(num);
    }
}
