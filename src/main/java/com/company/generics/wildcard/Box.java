package com.company.generics.wildcard;

class Box<T> {
    private T ob;

    public void set(T ob) {
        this.ob = ob;
    }

    public T get() {
        return ob;
    }

    @Override
    public String toString() {
        return ob.toString();
    }
}
