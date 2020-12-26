package com.company.binaryTree;


import java.util.*;

/**
 * Binary Search Tree
 *
 * @author doyoung0205@naver.com
 */

public class BinaryTree {

    private Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    //Node 를 삽입하는 함수
    public void insertNode(final int value) throws IllegalAccessException {


        if (checkRootNode(value)) return;

        // 자식을 추가하는 노드
        Node nodeToAdd = root;

        // 순회 하면서 자식을 추가하는 노드 찾아서
        // 값이 크면 우측, 작으면 좌측 에 추가
        while (true) {

            final int nodeToAddValue = nodeToAdd.getValue();

            //  노드 내 중복된 값은 존재할 수 없다.
            if (nodeToAddValue == value) {
                System.out.println("노드 내 중복된 값이 존재하여 삽입할 수 없습니다.");
                return;
            }

            if (nodeToAddValue > value) {
                //값이 작아 좌측으로 빠지는 경우
                if (nodeToAdd.isEmptyLeft()) {
                    nodeToAdd.setLeft(value);
                    return;
                }

                // 자식을 추가 하는 노드 왼쪽 자식 노드로 이동
                nodeToAdd = nodeToAdd.getLeft();


            } else /* (nodeToAddValue < value) */ {
                //값이 커 우측으로 빠지는 경우
                if (nodeToAdd.isEmptyRight()) {
                    nodeToAdd.setRight(value);
                    return;
                }

                // 자식을 추가 하는 노드 오른쪽 자식 노드로 이동
                nodeToAdd = nodeToAdd.getRight();

            }

        }

    }


    //Node 를 삭제하는 함수
    public void deleteNode(final int value) throws IllegalAccessException {

        if (root == null) {
            System.out.println("이진트리가 존재하지 않습니다.");
            return;
        }

        // 삭제할 노드
        Node nodeToRemove = root;
        // 삭제할 노드의 부모 노드
        Node parentNodeToRemove;

        // 삭제할 노드 찾기
        // 노드 순회 시작
        do {

            parentNodeToRemove = nodeToRemove;

            if (nodeToRemove.getValue() > value) {
                // 값이 작아 좌측으로 빠지는 경우
                if (nodeToRemove.getLeft() == null) {
                    System.out.println("삭제할 값이 존재하지 않습니다.");
                    return;
                }

                nodeToRemove = nodeToRemove.getLeft();

            } else if (nodeToRemove.getValue() < value) {
                // 값이 커 우측으로 빠지는 경우
                if (nodeToRemove.getRight() == null) {
                    System.out.println("삭제할 값이 존재하지 않습니다.");
                    return;
                }

                nodeToRemove = nodeToRemove.getRight();
            }

            if (nodeToRemove.getValue() == value) {
                break;
            }

        } while (nodeToRemove.getValue() != value);


        // 삭제할 노드의 자식이 없는 경우
        if (nodeToRemove.isEmptyChildAll()) {
            // 삭제할 노드가 root 인 경우
            if (nodeToRemove.equals(root)) {
                root = null;
            }
            // 삭제할 노드의 부모 노드의 오른쪽 자식과 삭제할 노드가 같을 떄
            else if (parentNodeToRemove.isRightByNode(nodeToRemove)) {
                parentNodeToRemove.rightClear();
            }
            // 삭제할 노드의 부모 노드의 왼쪽 자식과 삭제할 노드가 같을 떄
            else if (parentNodeToRemove.isLeftByNode(nodeToRemove)) {
                parentNodeToRemove.leftClear();
            }
            // 위 두 경우의 수가 아닐 때
            else {
                throw new IllegalAccessException("삭제할 노드의 부모 노드의 자식과 삭제할 노드가 " +
                        "일치하는 노드가 없음");
            }

        }
        // 왼쪽 노드 자식만 존재하는 경우
        else if (nodeToRemove.isEmptyLeft()) {

            if (nodeToRemove.equals(root)) {
                root = nodeToRemove.getLeft();
            } else if (parentNodeToRemove.isRightByNode(nodeToRemove)) {
                /*
                 * 삭제 대상의 왼쪽 자식 노드를 삭제 대상 위치에 둔다.
                 */
                parentNodeToRemove.setRight(nodeToRemove.getLeft());
            } else {
                parentNodeToRemove.setLeft(nodeToRemove.getLeft());
            }

        }
        // 오른쪽 노드 자식만 존재하는 경우
        else if (nodeToRemove.isEmptyRight()) {

            if (nodeToRemove.equals(root)) {
                root = nodeToRemove.getRight();
            } else if (parentNodeToRemove.isRightByNode(nodeToRemove)) {
                /*
                 * 삭제 대상의 오른쪽 자식 노드를 삭제 대상 위치에 둔다.
                 */
                parentNodeToRemove.setRight(nodeToRemove.getRight());
            } else {
                parentNodeToRemove.setLeft(nodeToRemove.getRight());
            }
        }
        /*
         * 두 개의 자식 노드가 존재하는 경우
         * 1. 삭제할 노드의 왼쪽 서브 트리에 있는 가장 큰 값 노드를 올리거나
         * 2. 오른쪽 서브 트리에 있는 가장 작은 값 노드를 올리면 된다.
         * 구현 코드는 2번째 방법을 사용한다.
         */
        else {

            // 삭제 대상 노드의 자식 노드 중에서 대체될 노드 (nodeToReplace) 를 찾는다.
            Node parentNodeToReplace = nodeToRemove;

            // 삭제 대상의 오른쪽 서브 트리 탐색 지정
            Node nodeToReplace = nodeToRemove.getRight();

            while (!nodeToReplace.isEmptyLeft()) {
                parentNodeToReplace = nodeToReplace;
                nodeToReplace = nodeToReplace.getLeft();
            }

            if (!nodeToRemove.isRightByNode(nodeToReplace)) {

                // 가장 작은 값을 선택하기 때문에 대체 노드의 왼쪽 자식은 빈 노드가 된다.
                parentNodeToReplace.setLeft(nodeToReplace.getRight());

                // 대체할 노드의 오른쪽 자식 노드를 삭제할 노드의 오른쪽으로 지정한다.
                nodeToReplace.setRight(nodeToRemove.getRight());
            }

            // 삭제할 노드가 루트 노드인 경우 대체할 노드로 바꾼다.
            if (nodeToRemove.equals(root)) {
                root = nodeToReplace;
            } else if (parentNodeToRemove.isRightByNode(nodeToRemove)) {
                parentNodeToRemove.setRight(nodeToReplace);
            } else {
                parentNodeToRemove.setLeft(nodeToReplace);
            }

            // 삭제 대상 노드의 왼쪽 자식을 잇는다.
            nodeToReplace.setLeft(nodeToRemove.getLeft());

        }
    }

    /**
     * 전위 순회
     */
    public void preOrderSearch(Node node, int depth) {

        if (node != null) {
            System.out.print(node.getValue() + " → ");
            preOrderSearch(node.getLeft(), depth + 1);
            preOrderSearch(node.getRight(), depth + 1);
        }
    }


    /**
     * 중위 순회
     */
    public void inOrderSearch(Node node, int depth) {
        if (node != null) {
            inOrderSearch(node.getLeft(), depth + 1);
            System.out.print(node.getValue() + "  → ");
            inOrderSearch(node.getRight(), depth + 1);
        }
    }

    /**
     * 후위 순회
     */
    public void postOrderSearch(Node node, int depth) {
        if (node != null) {
            postOrderSearch(node.getLeft(), depth + 1);
            postOrderSearch(node.getRight(), depth + 1);
            System.out.print(node.getValue() + " →  ");
        }
    }

    //BFS 구현
    public boolean bfs(int value) {

        //BFS 는 Queue 를 이용한다.

        final Queue<Node> queue = new LinkedList<>();
        //root 를 Queue 에 넣고 시작
        queue.add(root);

        final StringBuilder log = new StringBuilder();

        while (true) {

            Node currentNode = queue.poll();


            if (currentNode == null) {
                System.out.println("찾으려는 값이 없습니다.");
                return false;
            }

            BFSLogging(queue, currentNode);

            if (checkNodeFromBFS(value, currentNode, log)) {
                return true;
            }

            insertNodeFromBFS(queue, currentNode);
        }

    }

    /**
     * 검사한 노드의 자식이 있으면 Queue 에 저장한다.
     */
    private void insertNodeFromBFS(Queue<Node> queue, Node tempNode) {
        /* 좌측을 조사하지 않았다면 왼쪽 자식 노드 추가 **/
        final Node leftNode = tempNode.getLeft();

        //노드가 null 이면 queue 에 넣지 않는다.
        if (leftNode != null) {
            queue.add(leftNode);
        }

        final Node rightNode = tempNode.getRight();

        //노드가 null 이면 queue 에 넣지 않는다.
        if (rightNode != null) {
            queue.add(rightNode);
        }
    }

    private boolean checkNodeFromBFS(int value, Node tempNode, StringBuilder log) {
        if (tempNode.getValue() == value) {
            System.out.println("찾은 값 :: " + tempNode.getValue());
            System.out.println(log.toString());
            return true;
        } else {
            log.append(tempNode.getValue()).append("  →  ");
        }
        return false;
    }

    private void BFSLogging(Queue<Node> queue, Node tempNode) {
        System.out.print("tempNode :: " + tempNode.getValue() + "    |   ");

        System.out.print("queue :: ");
        queue.forEach(node -> {
            System.out.print(node.getValue() + ", ");
        });
        System.out.println();
    }

    /**
     * DFS(깊이탐색) 구현
     */
    public boolean dfs(int value) {

        //DFS 스택구현
        final Stack<Node> stack = new Stack<>();

        //Root 로 부터 시작
        stack.push(root);
        System.out.print(root.getValue() + "  →   ");

        //해당노드를 방문했는지 여부(왼쪽, 오른쪽 모두 체크했을때 해당 맵에 데이터 PUT)
        Map<Node, Integer> checkMap = new HashMap<>();

        //탐색시작
        while (true) {
            //스택이 비었을 경우 모든 데이터 탐색 완료.
            if (stack.isEmpty()) {
                System.out.print(" 찾으려는 데이터가 없습니다.");
                break;
            }

            Node currentNode = stack.peek();

            //LEFT 값이 결과 값이면 break;
            if ((currentNode.getLeft() != null && currentNode.getLeft().getValue() == value)) {
                System.out.print(currentNode.getLeft().getValue());
                return true;
            }

            //RIGHT 값이 결과 값이면 break;
            if ((currentNode.getRight() != null && currentNode.getRight().getValue() == value)) {
                System.out.print(currentNode.getRight().getValue());
                return true;
            }

            // LEFT 가 존재하면서 LEFT 에 방문한적이 없으면 PUSH
            if (currentNode.getLeft() != null && !checkMap.containsKey(currentNode.getLeft())) {
                System.out.print(currentNode.getLeft().getValue() + "  →   ");
                stack.push(currentNode.getLeft());
                continue;
            }

            //RIGHT 가 존재하면서 RIGHT 에 방문한적이 없으면 PUSH
            if (currentNode.getRight() != null && !checkMap.containsKey(currentNode.getRight())) {
                System.out.print(currentNode.getRight().getValue() + "  →   ");
                stack.push(currentNode.getRight());
                continue;
            }


            //양쪽에 모두 존재하지 않을 경우 스택에서 POP, 체크
            checkMap.put(currentNode, 1);
            stack.pop();
        }

        return false;
    }

    /**
     * 순회 결과 출력
     */
    public void printNode() {
        System.out.print("전위순회 시작 : ");
        preOrderSearch(root, 0);
        System.out.println("종료");

        System.out.print("중위순회 시작 : ");
        inOrderSearch(root, 0);
        System.out.println("종료");

        System.out.print("후위순회 시작 : ");
        postOrderSearch(root, 0);
        System.out.println("종료");
    }


    private void initRoot(Node root) {
        this.root = root;
    }

    //root 가 없을 경우 root 지정
    private boolean checkRootNode(int value) {
        if (root == null) {
            initRoot(new Node(value));
            return true;
        }
        return false;
    }


    public Node getRoot() {
        return root;
    }

    /**
     * @return 모든 노드의 개수
     */
    public int size() {


        return 0;
    }
}
