package com.BinaryTree;

public class BinaryTree {

    public Node root;

    public BinaryTree() {
       root = null;
    }

    public void preOrder(Node p,int level){
        int i;
        if(p==null){
            return;
        }
        System.out.print(p.data);
        System.out.print(" ");
        preOrder(p.lNode,level+1);
        preOrder(p.rNode,level+1);
    }

    public void createTree(){
        root=new Node(10);
        root.lNode=new Node(9);
        root.rNode=new Node(11);
        root.lNode.lNode=new Node(8);
        root.lNode.rNode=new Node(12);
        root.rNode.lNode=new Node(7);
        root.rNode.rNode=new Node(13);

    }
}
