package com.StackImpl;

public class TestStack {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.pull(21);
		s.pull(23);
		s.pull(34);
		s.printAllElement();
		s.pop();
		s.printAllElement();
	}

	
}
