package com.company.timeComplexity;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    // n 번 까지의 자연수의 합을 구하는 기능
    public static int count1(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    // n 번 까지의 자연수의 합을 구하는 기능
    public static int count2(int n) {
        return (n + 1) * n / 2;
    }

    public static void main(String[] args) {
        final int count1 = count1(5);
        final int count2 = count2(5);
        System.out.println(count1);
        System.out.println(count2);
    }
}
