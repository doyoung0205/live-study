package com.company.linkedlist;

public class LinkedList {


    /**
     * 원하는 위치에 노드를 추가 하는 기능
     *
     * @param head      첫 번째 노드를 가르키는 용도의 ListNode (데이터 저장 X)
     * @param nodeToAdd 추가할 ListNode
     * @param position  추가할 위치
     * @return 추가한 ListNode
     */
    ListNode add(ListNode head, ListNode nodeToAdd, int position) {

        ListNode target = head;

        //해당 Node 를 넣어야할 position 전까지 이동.
        for (int i = 0; i < position - 1; i++) {

            // 다음 노드가 없을 경우 가장 마지막 노드를 반환
            if (target.getPoint() == null) {
                break;
            }

            target = target.getPoint();
        }

        ListNode currentNode = target;
        final ListNode nextNode = target.getPoint();

        // 기존
        // A(target) -> C(target.point)

        // 추가할 노드에 기존에 다음 노드 를 삽입
        // B(nodeToAdd) -> C(target.point)
        nodeToAdd.updateNextPoint(nextNode);

        // 기존에 다음 노드에 추가한 노드
        // A(target) -> B(target.point = nodeToAdd) -> C (nodeToAdd.point)
        currentNode.updateNextPoint(nodeToAdd);

        return head;
    }

    /**
     * 원하는 위치에 노드를 삭제하는 기능
     *
     * @param head             첫 번째 노드를 가르키는 Node
     * @param positionToRemove 삭제할 ListNode 위치
     * @return 삭제한 ListNode
     */
    ListNode remove(ListNode head, int positionToRemove) {
        ListNode target = head;

        if (positionToRemove <= 0) {
            System.out.println("positionToRemove 은 양수만");
            return null;
        }


        //해당 Node 를 삭제할 position 전까지 이동.
        for (int i = 0; i < positionToRemove - 1; i++) {

            //삭제 position 이 클경우 아무런 삭제도 하지 않음.
            if (target.getPoint() == null) {
                return null;
            }

            target = target.getPoint();
        }


        ListNode deletePrevNode = target;
        ListNode deleteTargetNode = deletePrevNode.getPoint();
        // 제거 하려고 하는 node 가 없다면 아무런 삭제도 하지 않음
        if (deleteTargetNode == null) {
            System.out.println("제거 하려는 노드가 없음");
            return null;
        }

        ListNode deleteNextNode = deleteTargetNode.getPoint();

        deletePrevNode.updateNextPoint(deleteNextNode);


        //변경 전 :A(tempNode) -> B(positionToRemove) -> C
        //변경 후 :A(tempNode) -> C

        return head;
    }

    /**
     * 해당 노드가 포함되어 있는지 확인하는 기능
     *
     * @param head        첫 번째 노드를 가르키는 Node
     * @param nodeToCheck 확인하기 위한 노드
     * @return Boolean 존재 여부
     */
    boolean contains(ListNode head, ListNode nodeToCheck) {
        while (head != null) {
            if (head.equals(nodeToCheck)) return true;
            head = head.getPoint();
        }
        return false;
    }

    //결과값 출력함수.
    public String toString(ListNode head) {
        StringBuilder str = new StringBuilder();
        ListNode tempNode = head;

        int index = -1;
        while (tempNode != null) {

            index++;

            // head 일 경우 생략
            if (index == 0) {
                tempNode = tempNode.getPoint();
                continue;
            }

            str.append(tempNode.getData()).append(" ");

            if (tempNode.getPoint() == null) {
                break;
            }

            tempNode = tempNode.getPoint();


        }


        return str.toString();
    }


}
