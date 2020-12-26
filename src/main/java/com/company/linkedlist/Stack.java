package com.company.linkedlist;

import java.util.Arrays;

public class Stack {

    private int size = 5; // 스택의 용량
    private int[] valeus; // 스택에 저장된 값들
    private int topIndex; // 스택의 포인터

    //stack 생성자
    public Stack() {
        this.topIndex = 0;
        valeus = new int[size];
    }

    public void push(int data) {

        // 스택이 다 찼을 경우
        if (size - 1 == topIndex) {
            size += 5;
            valeus = Arrays.copyOf(valeus, size);
            valeus[topIndex++] = data;
            return;
        }

        valeus[topIndex++] = data;

    }


    public int pop() {
        // 데이터가 없을 경우
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        // 배열의 마지막 데이터를 반환하고 초기화, 배열 사이즈 조절
        int popData = valeus[topIndex--];
        valeus[topIndex] = 0;

        if (size > topIndex + 5) {

            size -= 5;
            valeus = Arrays.copyOf(valeus, size);
        }
        return popData;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "size=" + size +
                ", valeus=" + Arrays.toString(valeus) +
                ", topIndex=" + topIndex +
                '}';
    }
}
