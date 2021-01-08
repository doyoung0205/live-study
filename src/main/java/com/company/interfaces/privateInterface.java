package com.company.interfaces;

public interface privateInterface {
    default void hello() {
        say("hello");
    }

    default void bye() {
        say("bye");
    }

    private void say(String message) {
        System.out.println(message);
    }
}
