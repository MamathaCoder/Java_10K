package com.coders.inheritancedemo;

class Father1 {
	
	int money=10000;
	String car="BMW";
	
	void drinking() {
		System.out.println("Coffie");
	}
}
class Son extends Father1{
	String cycle="pink";
	
	void read() {
		System.out.println("java");
	}
}
public class Father{
	public static void main(String[] args) {
		Son s1=new Son();
		System.out.println(s1.cycle);
		System.out.println(s1.money);
		System.out.println(s1.car);
		s1.drinking();
		s1.read();
	}
}


