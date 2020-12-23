package com.company.binaryTree;

public class Node {

    private final int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setLeft(int value) throws IllegalAccessException {
        if (value >= this.value) {
            throw new IllegalAccessException("왼쪽 자식 노드의 값은 부모 노드의 값보다 작다.");
        }
        this.left = new Node(value);
    }

    public void setLeft(Node node) throws IllegalAccessException {
        if (node.getValue() >= this.value) {
            throw new IllegalAccessException("왼쪽 자식 노드의 값은 부모 노드의 값보다 작다.");
        }
        this.left = node;
    }

    public void setRight(int value) throws IllegalAccessException {
        if (value <= this.value) {
            throw new IllegalAccessException("오른쪽 자식 노드의 값은 부모 노드의 값보다 크다.");
        }
        this.right = new Node(value);
    }

    public void setRight(Node node) throws IllegalAccessException {
        if (node.value <= this.value) {
            throw new IllegalAccessException("오른쪽 자식 노드의 값은 부모 노드의 값보다 크다.");
        }
        this.right = node;
    }


    public boolean isEmptyLeft() {
        return this.left == null;
    }

    public boolean isEmptyRight() {
        return this.right == null;
    }

    public boolean isRightByNode(final Node node) {
        if (this.right == null || node == null) {
            return false;
        }
        return this.right.equals(node);
    }

    public void rightClear() {
        this.right = null;
    }

    public boolean isLeftByNode(final Node node) {
        if (this.left == null || node == null) {
            return false;
        }
        return this.left.equals(node);
    }

    public void leftClear() {
        this.left = null;
    }

    public boolean isEmptyChildAll() {
        return this.left == null && this.right == null;
    }
}
