package com.BinaryTree;

public class TestBinaryTree {
    public static void main(String[] args) {
        BinaryTree b=new BinaryTree();
        b.createTree();
        b.preOrder(b.root,2);
    }
}
