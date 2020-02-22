package com.LinkedListImpl;

public class Linkedlist {
	
	Node start;
	
	Linkedlist(){
		start=null;
	}
	
	public void addAtStart(int newNode) {
		Node p=new Node(newNode);
		if(start==null) {
			start=p;
		}else {
		p.next=start;
		start=p;
		}
	}
	
	public void addAtLast(int newNode) {
		Node p=new Node(newNode);
		Node k=start;
		while(k.next!=null) {
			k=k.next;
		}
		k.next=p;
	}
	
	public void addAfter(int insert,int after) {
		Node p=start;
		Node newNode=new Node(insert);
		while(p.next!=null) {
			if(p.data==after) {
				newNode.next=p.next;
				p.next=newNode;
				return;
			}
			p=p.next;	
		}
		System.out.println(after+" not found in this LinkedList");	
	}
	
	public void deleteAtStart() {
		start=start.next;
	}
	
	public void deleteThis(int dlt) {
		Node p=start;
		Node newNode=new Node(dlt);
		while(p.next.next!=null) {
			if(p.next.data==dlt) {
				p.next=p.next.next;
				return;
			}
			p=p.next;	
		}
		System.out.println(dlt+" not found in this LinkedList");	
	}
	
	public void deleteAtLast() {
		Node p=start;
		while(p.next.next!=null) {
			p=p.next;
		}
		p.next=null;
	}
	
	
	public void printAll() {
		int count=0;
		Node p=start;
		System.out.println("***Printing all element***");
		while(p!=null) {
			System.out.println(p.data);
			count++;
			p=p.next;
		}
		System.out.println("Total Element"+count);
	}

}
