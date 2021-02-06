
package com.company.annotaions;


import lombok.*;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;


@SampleAnnotation
@Controller
@Transactional

public class Test {
    @Builder
    public Test() {
    }


    public static void main(String[] args) {
        String str = "";
        System.out.println("asdsad");
    }
}
