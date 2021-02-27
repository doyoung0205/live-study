package com.company.generics.before;

public class Box {
    private Object ob; // Object 를 상속하는 인스턴스면 무엇이든 담는다.

    public void setOb(Object ob) {
        this.ob = ob;
    }

    public Object getOb() {
        return ob;
    }
}
