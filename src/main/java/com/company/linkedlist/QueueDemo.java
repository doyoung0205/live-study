package com.company.linkedlist;

public class QueueDemo {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(1);
        System.out.println("enQueue 1 -> " + queue);
        queue.enQueue(2);
        System.out.println("enQueue 2 -> " + queue);
        queue.enQueue(3);
        System.out.println("enQueue 3 -> " + queue);
        queue.enQueue(4);
        System.out.println("enQueue 4 -> " + queue);
        queue.enQueue(5);
        System.out.println("enQueue 5 -> " + queue);
        queue.enQueue(6);
        System.out.println("enQueue 6 -> " + queue);


        queue.deQueue();
        System.out.println("deQueue  -> " + queue);
        queue.deQueue();
        System.out.println("deQueue  -> " + queue);
        queue.deQueue();
        System.out.println("deQueue  -> " + queue);
        queue.deQueue();
        System.out.println("deQueue  -> " + queue);

    }
}
