package com.codegnan.dsa.arrays;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String>stack=new Stack<>();
		stack.push("Java");
		stack.push("python");
		stack.push("c++");
		System.out.println(stack);
		String peekElements=stack.peek();
		System.out.println(peekElements);
		System.out.println(stack.pop());
		System.out.println("Afterpop:"+stack);
		
	}

}
