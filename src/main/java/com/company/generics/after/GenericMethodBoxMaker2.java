package com.company.generics.after;

public class GenericMethodBoxMaker2 {
    public static void main(String[] args) {
        Box<String> sBox = BoxFactory.<String>makeBox("Sweet");
        Box<Double> dBox = BoxFactory.<Double>makeBox(0.123); // 오토 박싱 진행됨
    }
}
