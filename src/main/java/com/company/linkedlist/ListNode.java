package com.company.linkedlist;

import java.util.Objects;


public class ListNode {

    // 데이터
    private Integer data;

    // 다음 ListNode 좌표
    private ListNode point;

    public ListNode() {
    }

    public ListNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public ListNode getPoint() {
        return point;
    }

    public void updateNextPoint(ListNode point) {
        this.point = point;
    }

    // Node 의 data 값과 point 값이 일치하면 성립한다.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        ListNode other = (ListNode) o;
        return this.data == other.data && Objects.equals(this.point, other.point);
    }


}
