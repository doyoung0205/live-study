package com.company.control;

import java.util.Arrays;
import java.util.List;

public class IfElseEx {
    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(
                new Person("김도영", 31, "남성", "korea"),
                new Person("김도일", 21, "남성", "korea"),
                new Person("김도이", 11, "여성", "korea"),
                new Person("김도삼", 41, "남성", "korea")
        );


        int manCount = 0;

        for (Person person : personList) {

            if (person.getGender().equals("여성")) {
                continue;
            }

            manCount++;
        }

        System.out.println(manCount);


    }
}
