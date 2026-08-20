package com.coders.inheritancedemo;

public class Inheritancedemo {
	
	int add(int a, int b) {
		return a+b;
		
	}
	int sub(int a, int b) {
		return a-b;
		
	}
	
	public static void main(String[] args) {
		Inheritancedemo d1=new Inheritancedemo();
		
		//d1.add(29, 23);
		//d1.sub(45, 20);
		
		System.out.println(d1.add(20, 10));
		System.out.println(d1.sub(30, 40));
	}
}
