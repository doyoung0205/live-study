package com.company;

public class Hello {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        // 코드는 한줄인데 사실상 두줄이라고 판단한다.
        // 이때 멀티스레드 환경에서 레이스 컨디션 발생해서 문제가 발생할 수 있다.

        // 싱글톤 패턴 더블 채크드 락킹을 하는 이유


    }

    // 인스턴스를 사용하지 않아도 이친구를 만들어야 한다.
    private static Hello hello = new Hello();

    private Hello() {

    }

    public static Hello getInstance() {
        return hello;
    }

}
