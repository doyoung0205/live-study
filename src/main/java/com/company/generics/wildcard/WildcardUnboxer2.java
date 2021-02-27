package com.company.generics.wildcard;

public class WildcardUnboxer2 {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("So Simple String");
        Unboxer2.peekBox(box); // So Simple String 출력
    }
}


