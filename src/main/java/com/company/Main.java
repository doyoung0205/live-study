package com.company;

        import java.math.BigDecimal;

public class Main {

    static int i2;

    public static void main(String[] args) {

        // 부동 소수가 정확하지 않다는 점

        float number = 0f;
        for (int i = 0; i < 10; i++) {
            number += 0.1f;
        }

        System.out.println(number); // 1.0000001
        // 돈계산은 절대 float double 하면 안됨
        // BigDecimal 로 해야 한다.

        BigDecimal number2 = BigDecimal.ZERO;
        for (int i = 0; i < 10; i++) {
            number2 = number2.add(BigDecimal.valueOf(0.1));
        }
        System.out.println(number2);
        // 1.0

        /*
         * op 코드
         * */
    }


}
