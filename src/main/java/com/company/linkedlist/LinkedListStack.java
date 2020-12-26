package com.company.linkedlist;

public class LinkedListStack {
    ListNode head;

    public LinkedListStack() {
    }

    public LinkedListStack(ListNode head) {
        this.head = head;
    }

    public void push(int data) {
        ListNode pushNode = new ListNode(data);
        this.pushNode(pushNode);
    }

    public int pop() {
        ListNode popNode = this.popNode();

        if (popNode == null) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return popNode.getData();
    }


    private void pushNode(ListNode pushNode) {
        ListNode tempNode = head;

        if (head == null) {
            head = pushNode;
            return;
        }

        // 가장 마지막 노드로 이동
        while (tempNode.getPoint() != null) {
            tempNode = tempNode.getPoint();
        }

        //A(tempNode) - > B(addNode) -> null 형태
        tempNode.updateNextPoint(pushNode);
        pushNode.updateNextPoint(null);

    }

    private ListNode popNode() {
        ListNode tempNode = head;
        ListNode beforeNode = null;

        if (head == null) {
            return null;

        }

        // 가장 마지막 노드로 이동
        while (tempNode.getPoint() != null) {
            beforeNode = tempNode;
            tempNode = tempNode.getPoint();
        }

        if (beforeNode != null) {
            beforeNode.updateNextPoint(null);
        }

        if (tempNode.equals(head)) {
            head = null;
        }


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

