package com.company;

public class Hello2 {
    public static void main(String[] args) {

    }


    private static Hello2 hello;

    private Hello2() {

    }
    // 필요할 때 만들게 된다.
    public static Hello2 getInstance() {
        if (hello == null) {
            // 이때 멀티 쓰레드 환경에서 두줄 이됨
            hello = new Hello2();
            // TODO 락을 해야함
        }

        return hello;
    }

}
