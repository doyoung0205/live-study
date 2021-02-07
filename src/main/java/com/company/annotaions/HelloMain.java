package com.company.annotaions;

import java.lang.annotation.Annotation;

public class HelloMain {
    public static void main(String[] args) {
        Annotation[] annotations = HelloController.class.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }
}
