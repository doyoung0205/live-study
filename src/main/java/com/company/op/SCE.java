package com.company.op;

public class SCE {
    public static void main(String[] args) {
int number1 = 0;
int number2 = 0;
boolean result;

result = ((number1 += 10) < 0) && ((number2 += 10) > 0);
System.out.println("result = " + result);
System.out.println("number1 = " + number1);
System.out.println("number2 = " + number2);

result = ((number1 += 10) > 0) || ((number2 += 10) > 0);
System.out.println("result = " + result);
System.out.println("number1 = " + number1);
System.out.println("number2 = " + number2);

        System.out.println("(number1 >> 1) = " + (number1 >> 1));

    }
}
