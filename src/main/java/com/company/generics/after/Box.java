package com.company.generics.after;

public class Box<T> {
    private T ob;

    public void set(T ob) {
        this.ob = ob;
    }

    public T get() {
        return ob;
    }
}
