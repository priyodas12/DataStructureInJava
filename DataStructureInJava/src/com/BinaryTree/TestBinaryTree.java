package com.BinaryTree;

public class TestBinaryTree {

    public static void main(String[] args) {
        BinaryTree b=new BinaryTree();
        b.createTree();
        System.out.print("\nPreorder:\n");
        b.preOrder(b.root,2);
        System.out.print("\ninOrder:\n");
        b.inOrder(b.root);
        System.out.print("\npostOrder:\n");
        b.postOrder(b.root);
    }
}
