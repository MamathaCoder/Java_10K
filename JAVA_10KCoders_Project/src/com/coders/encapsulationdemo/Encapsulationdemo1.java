package com.coders.encapsulationdemo;

public class Encapsulationdemo1 {
	//data members
	int serialnumber;
	String name;
	int age;
	//member functions 
	void display() {
		System.out.println("The data values:"+ " " + serialnumber+ " "+ name +" "+ age);
	}
	public static void main(String[] args) {
        Encapsulationdemo2 e2=new Encapsulationdemo2();
		
		e2.setSerialnumber(102);
		e2.setName("Maggie");
		e2.setAge(24);
		
		System.out.println(e2.getSerialnumber());
		System.out.println(e2.getName());
		System.out.println(e2.getAge());
	}
}
