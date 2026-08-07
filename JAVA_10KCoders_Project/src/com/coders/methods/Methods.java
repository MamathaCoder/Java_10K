package com.coders.methods;

public class Methods {
	
	static int add(int a,int b) {//method for adding two numbers
		return a+b;
	}
	
	static int sub(int a,int b) {//method for adding two numbers
		return a-b;
	}
	
	static int multi(int a,int b) {//method for adding two numbers
		return a*b;
	}
	static int div(int a,int b) {//method for adding two numbers
		return a/b;
	}
	
	static String Student(String name) {//method for printing name
		return name;
	}
	static int add(int a,int b,int c) {//method overloading
		return a+b+c;
	}
	
	public static void main(String[] args) {
		System.out.println(add(2,5));
		System.out.println(add(7,4));
		System.out.println(sub(4,4));
		System.out.println(multi(4,4));
		System.out.println(div(4,4));
		
		System.out.println(div(4,7));
		
		System.out.println(Student("Hartheek"));
		
		System.out.println(add(2,5,6));
		}
		
}