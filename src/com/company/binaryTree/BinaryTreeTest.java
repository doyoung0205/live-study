package com.company.binaryTree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    private static BinaryTree binaryTree;


    final static int rootValue = 23;

    @BeforeEach
    public void rootInit() {
        binaryTree = new BinaryTree(new Node(rootValue));
    }


    @Test
    @DisplayName("dfs")
    void dfs() throws IllegalAccessException {
        // given
        final BinaryTree binaryTree = sampleBinaryTree();

        // when
        final boolean result = binaryTree.dfs(35);

        // then
        assertTrue(result);


    }

    @Test
    @DisplayName("bfs")
    void bfs() throws IllegalAccessException {
        // given
        final BinaryTree binaryTree = sampleBinaryTree();

        // when
        final boolean result = binaryTree.bfs(35);

        // then
        assertTrue(result);

    }


    @Test
    @DisplayName("이진트리에 값을 삭제 하는 경우")
    void deleteNode() throws IllegalAccessException {
        // given
        final Node root = sampleBinaryTree().getRoot();

        // when
        assertEquals(root.getRight().getValue(), 29);
        BinaryTreeTest.binaryTree.deleteNode(29);

        // then
        assertAll(() -> {
            assertEquals(root.getRight().getValue(), 33);
            assertNotEquals(root.getRight().getValue(), 29);

        });
    }


    @Test
    @DisplayName("이진트리에 중복값이 들어갔을 경우")
    void insertDuplicateValue() {
        // given
        binaryTree = new BinaryTree(new Node(rootValue));
        // when

        // then

    }

    @Test
    @DisplayName("이진트리에 제대로 들어 갔을 경우")
    void insertNode() throws IllegalAccessException {

        // given
        final Node root = sampleBinaryTree().getRoot();

        assertAll(() -> {
            assertEquals(root.getLeft().getValue(), 10);
            assertEquals(root.getLeft().getLeft().getValue(), 4);
            assertEquals(root.getLeft().getLeft().getLeft().getValue(), 3);
            assertEquals(root.getRight().getValue(), 29);
            assertEquals(root.getRight().getLeft().getValue(), 28);
            assertEquals(root.getRight().getLeft().getLeft().getValue(), 27);
            assertEquals(root.getRight().getRight().getValue(), 40);
            assertEquals(root.getRight().getRight().getLeft().getValue(), 33);
            assertEquals(root.getRight().getRight().getRight().getValue(), 50);
            assertEquals(root.getRight().getRight().getLeft().getRight().getValue(), 35);
        });

    }

    private BinaryTree sampleBinaryTree() throws IllegalAccessException {

        // root 23 에서 왼족으로 10 삽입
        binaryTree.insertNode(10);

        // root 23 에서 오른족으로 15 삽입
        binaryTree.insertNode(29);

        // 29 노드 에서 왼족으로 28 삽입
        binaryTree.insertNode(28);

        // 27 노드 에서 왼족으로 28 삽입
        binaryTree.insertNode(27);

        // 29 노드 에서 오른쪽으로 40 삽입
        binaryTree.insertNode(40);

        // 40 노드 에서 왼쪽으로 33 삽입
        binaryTree.insertNode(33);

        // 40 노드 에서 오른쪽으로 50 삽입
        binaryTree.insertNode(50);

        // 33 노드 에서 오른쪽으로 35 삽입
        binaryTree.insertNode(35);

        // 33 노드 에서 왼쪽으로 32 삽입
        binaryTree.insertNode(32);

        // 10 노드 에서 왼쪽으로 4 삽입
        binaryTree.insertNode(4);

        // 10 노드 에서 오른쪽으로 11 삽입
        binaryTree.insertNode(11);

        // 4 노드 에서 왼쪽으로 3 삽입
        binaryTree.insertNode(3);

        return binaryTree;
    }


    @Test
    @DisplayName("루트 초기화 23 인가요?")
    void initRoot() {
        assertEquals(binaryTree.getRoot().getValue(), 23);
    }
}
