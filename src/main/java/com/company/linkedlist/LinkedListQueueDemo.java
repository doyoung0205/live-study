package com.company.linkedlist;

public class LinkedListQueueDemo {
    public static void main(String[] args) {
        LinkedListQueue linkedListQueue = new LinkedListQueue();

        linkedListQueue.enQueue(1);
        System.out.println("enQueue 1 -> " + linkedListQueue);
        linkedListQueue.enQueue(2);
        System.out.println("enQueue 2 -> " + linkedListQueue);
        linkedListQueue.enQueue(3);
        System.out.println("enQueue 3 -> " + linkedListQueue);
        linkedListQueue.enQueue(4);
        System.out.println("enQueue 4 -> " + linkedListQueue);
        linkedListQueue.enQueue(5);
        System.out.println("enQueue 5 -> " + linkedListQueue);

        linkedListQueue.deQueue();
        System.out.println("deQueue -> " + linkedListQueue);
        linkedListQueue.deQueue();
        System.out.println("deQueue -> " + linkedListQueue);
        linkedListQueue.deQueue();
        System.out.println("deQueue -> " + linkedListQueue);
        linkedListQueue.deQueue();
        System.out.println("deQueue -> " + linkedListQueue);

    }
}


//        Queue


