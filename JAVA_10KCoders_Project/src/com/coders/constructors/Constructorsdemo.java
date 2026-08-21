package com.coders.constructors;

public class Constructorsdemo {
	
	String name;int mark;
	
	Constructorsdemo(String name, int marks){//constructor 
		this.name=name;
		this.mark=marks;
	}
	void show() {
		System.out.println(name + ": "+ mark);
	}	
	

	public static void main(String[] args) {
		
		Constructorsdemo s=new Constructorsdemo("Mina", 90);
		s.show();
	}
}
