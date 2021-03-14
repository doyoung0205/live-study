package com.company.lamdba;

import java.util.Arrays;
import java.util.function.Consumer;

public class StringComparator {
    public static void main(String[] args) {
        String[] names = {"keesun", "whiteship", "toby"};

        // TODO (o1, o2) -> o1.compareTo(o2)
        // TODO String::compareToIgnoreCase -> (this, o2) -> this.compareTo(o2)
        // 왜 매개변수 하나인데 어떻게 sort 가 가능한지
        Arrays.sort(names, String::compareToIgnoreCase);

        Integer baseNumber = 10;

        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer baseNumber) {
                System.out.println(baseNumber);
            }
        };
        integerConsumer.accept(10);

//        IntConsumer printInt = (baseNumber) -> {
//            System.out.println(baseNumber);
//        };


    }
}
