package com.company.lamdba.refer;

import com.company.lamdba.Apple;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

public class MethodRef {
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();

        inventory.sort((Apple a1, Apple a2) -> a1.getWight().compareTo(a2.getWight()));
        inventory.sort(comparing(Apple::getWight));

    }
}
