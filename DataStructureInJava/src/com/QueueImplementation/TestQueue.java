package com.QueueImplementation;

public class TestQueue {

	public static void main(String[] args) {
		QueueImpl qi=new QueueImpl();
		qi.pull(20);
		qi.pull(21);
		qi.pull(22);
		qi.pull(23);
		qi.printAllElement();
		qi.pop();
		qi.printAllElement();
 
	}

}
