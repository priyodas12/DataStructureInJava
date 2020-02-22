package com.StackImpl;


public class Stack {
	
	Node head;
	
	Stack(){
		head=null;
	}
	
	public void pull(int val) {
		Node p=new Node(val);
		if(head==null) {
			head=p;
		}
		else {
			p.next=head;
			head=p;
		}
	}
	public void pop() {
		head=head.next;
	}
	
	public void printAllElement() {
		Node p=head;
		System.out.println("*****Printing All******");
		while(p!=null) {
			System.out.println(p.data);
			p=p.next;
		}	
	}

}
