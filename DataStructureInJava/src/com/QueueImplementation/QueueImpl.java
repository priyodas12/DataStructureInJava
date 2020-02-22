package com.QueueImplementation;

public class QueueImpl {
	
	Node head;
	
	QueueImpl(){
		head=null;
	}
	//Enter in First
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
	//Delete at Last
	public void pop() {
		Node p=head;
		while(p.next.next!=null) {
			p=p.next;
		}
		p.next=null;
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
