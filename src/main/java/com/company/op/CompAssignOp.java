package com.company.op;

public class CompAssignOp {
    public static void main(String[] args) {
        short shortNumber = 10;
        shortNumber = (short) (shortNumber + 77L);
        int intNumber = 3;
        intNumber = (int) (intNumber * 3.3);
        System.out.println(shortNumber);
        System.out.println(intNumber);

        shortNumber = 10;
        shortNumber += 77L;
        intNumber = 3;
        intNumber += 3.3;
        System.out.println(shortNumber);
        System.out.println(intNumber);



        

    }


}
