package com.coders.encapsulationdemo;

public class Encapsulationdemo2 {
	private int serialnumber;
	private String name;
	private int age;
	
	//setters and getter methods
	
	public int getSerialnumber() {
		return serialnumber;
	}
	public void setSerialnumber(int serialnumber) {
		this.serialnumber = serialnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
