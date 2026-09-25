package com.coders.collections;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		
		Stack<Integer> s=new Stack<>();
		
		//Push elements onto the satck
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		//Pop elements 
		
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}

}
