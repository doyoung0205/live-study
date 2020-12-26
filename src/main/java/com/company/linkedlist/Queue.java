package com.company.linkedlist;

import java.util.Arrays;

public class Queue {
    private int[] values;

    public Queue() {

    }

    public Queue(int[] values) {
        this.values = values;
    }

    //인큐 : 데이터 삽입
    public void enQueue(int data) {
        //맨 처음 들어오는 데이터에 대한 처리
        if (values == null) {
            values = new int[1];
            values[0] = data;
            return;
        }

        //정수 배열의 크기를 늘려준 뒤 마지막에 데이터를 넣어준다.(스택과 동일)
        values = Arrays.copyOf(values, values.length + 1);
        values[values.length - 1] = data;
    }

    //디큐 : 데이터 삭제
    public int deQueue() {
        //데이터가 없을 경우 처리
        if (values.length - 1 == -1) {
            throw new ArrayIndexOutOfBoundsException();
        }

        //배열의 처음 데이터를 반환한 뒤, 정수 배열을 줄여준다.
        int popData = values[0];

        //배열 Index를 앞으로 당겨서 빈 공간을 채워준다.
        int[] tempArr = new int[values.length - 1];
        System.arraycopy(values, 1, tempArr, 0, tempArr.length);

        values = tempArr;
        return popData;
    }

    //테스트 출력용 함수
    public String toString() {
        StringBuilder str = new StringBuilder();

        for (int value : values) {
            str.append(value).append(" ");
        }

        return str.toString();
    }


}
