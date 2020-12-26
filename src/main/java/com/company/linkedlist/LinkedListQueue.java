package com.company.linkedlist;

public class LinkedListQueue {

    ListNode head;

    public LinkedListQueue() {
    }

    public LinkedListQueue(ListNode head) {
        this.head = head;
    }


    public void enQueue(int data) {
        ListNode pushNode = new ListNode(data);
        this.enQueueNode(pushNode);
    }

    public int deQueue() {
        ListNode popNode = this.deQueueNode();

        if (popNode == null) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return popNode.getData();
    }


    private void enQueueNode(ListNode pushNode) {
        ListNode tempNode = head;

        if (head == null) {
            head = pushNode;
        } else {

            while (tempNode.getPoint() != null) {
                tempNode = tempNode.getPoint();
            }

            //A(tempNode) - > B(addNode) -> null 형태
            tempNode.updateNextPoint(pushNode);
            pushNode.updateNextPoint(null);
        }
    }

    private ListNode deQueueNode() {
        ListNode tempNode = head;

        if (head == null) {
            return null;
        }

        head = null;
        head = tempNode.getPoint();

        return tempNode;
    }

    //결과값 출력함수.
    public String toString() {
        StringBuilder str = new StringBuilder();
        ListNode tempNode = head;

        //헤더가 없을 경우 그냥 리턴
        if (tempNode == null) {
            return null;
        }

        while (true) {
            str.append(tempNode.getData()).append(" ");

            if (tempNode.getPoint() == null) {
                break;
            }

            tempNode = tempNode.getPoint();
        }
        return str.toString();
    }

}


