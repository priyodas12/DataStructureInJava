package com.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    public Node root;

    public BinaryTree() {
       root = null;
    }

    public void preOrder(Node p,int level){
        if(p==null){
            return;
        }
        System.out.print(p.data);
        System.out.print(" ");
        preOrder(p.lNode,level+1);
        preOrder(p.rNode,level+1);
    }
    public void inOrder(Node p){
        if(p==null){
            return;
        }
            inOrder(p.lNode);
            System.out.print(p.data+" ");
            inOrder(p.rNode);

    }
    public void postOrder(Node p){
        if(p==null){
            return;
        }
        postOrder(p.lNode);
        postOrder(p.rNode);
        System.out.print(p.data+" ");
    }

    public void levelOrder(Node p){
        List<Integer> al=new ArrayList<>();
        if(p==null){
            System.out.println("Node was empty!");
            return;
        }

        if(p.rNode!=null && p.lNode!=null){


        }

    }
    public void printAllLeaf(Node p){
        if(p==null){
           // System.out.println("Node was empty!");
            return;
        }
        if(p.rNode==null && p.lNode==null){
            System.out.println(p.data);
        }
        printAllLeaf(p.lNode);
        printAllLeaf(p.rNode);
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
