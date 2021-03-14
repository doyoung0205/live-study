package com.company.lamdba;

import java.nio.file.DirectoryStream;
import java.util.Comparator;
import java.util.function.Function;

public class LambdaEx {
    public static void main(String[] args) {
//        Function<String, Integer> stringLengthFunction = String::length;


        Function<String, Integer> stringLengthFunction = (String s) -> s.length();

        DirectoryStream.Filter<Apple> appleFilter = (Apple a) -> a.getWight() > 150;

//        (int x, int y) -> {
//            System.out.println("RESULT: ");
//            System.out.println(x + y);
//        }

        Comparator<Apple> appleComparator = (Apple a1, Apple a2) -> a1.getWight().compareTo(a2.getWight());
        Comparator<Apple> appleComparator2 = (a1, a2) -> a1.getWight().compareTo(a2.getWight());


    }
}
