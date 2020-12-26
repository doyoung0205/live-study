package com.company.linkedlist;

public class LinkedListStackDemo {
    public static void main(String[] args) {
        LinkedListStack list = new LinkedListStack();

        list.push(1);
        System.out.println(" push 1 -> " + list);
        list.push(2);
        System.out.println(" push 2 -> " + list);
        list.push(3);
        System.out.println(" push 3 -> " + list);
        list.push(4);
        System.out.println(" push 4 -> " + list);
        list.push(5);
        System.out.println(" push 5 -> " + list);
        list.push(6);
        System.out.println(" push 6 -> " + list);


        list.pop();
        System.out.println(" pop -> " + list);
        list.pop();
        System.out.println(" pop -> " + list);
        list.pop();
        System.out.println(" pop -> " + list);
        list.pop();
        System.out.println(" pop -> " + list);
        list.pop();
        System.out.println(" pop -> " + list);


    }

}
