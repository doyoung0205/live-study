package com.company.linkedlist;

public class StackDemo {
    public static void main(String[] args) {
Stack stack = new Stack();

stack.push(1);
System.out.println("push 1 ->" +stack);
stack.push(2);
System.out.println("push 2 ->" +stack);
stack.push(3);
System.out.println("push 3 ->" +stack);
stack.push(4);
System.out.println("push 4 ->" +stack);
stack.push(4);
System.out.println("push 4 ->" +stack);
stack.push(4);
System.out.println("push 4 ->" +stack);
stack.push(5);
System.out.println("push 5 ->" +stack);



stack.pop();
System.out.println("pop -> " +  stack);
stack.pop();
System.out.println("pop -> " +  stack);
stack.pop();
System.out.println("pop -> " +  stack);
stack.pop();
System.out.println("pop -> " +  stack);


    }
}
