package com.company.generics.after;

public class BoxFactory<T> {
    public static <T>  Box<T> makeBox(T o){
        Box<T> box = new Box<>(); // 상자를 생성하고,
        box.set(o); // 전달된 인스턴스를 상자에 담아서,
        return box; // 상자를 반환한다.
    }
}
