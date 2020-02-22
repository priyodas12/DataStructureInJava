package com.LinkedListImpl;

public class TestLinkedlist {

	public static void main(String[] args) {
		Linkedlist linkedList=new Linkedlist();
		linkedList.addAtStart(20);
		linkedList.addAtStart(21);
		linkedList.addAtStart(22);
		linkedList.printAll();
		linkedList.addAtLast(25);
		linkedList.printAll();
		linkedList.addAfter(27, 20);
		linkedList.printAll();
		linkedList.deleteAtLast();
		linkedList.printAll();
		linkedList.deleteAtStart();
		linkedList.printAll();
		linkedList.deleteThis(20);
		linkedList.printAll();
	}

}
