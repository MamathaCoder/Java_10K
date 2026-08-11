package com.coders.accessspecifiers;

public class Publicdemo1 {
	public int age=22;//public access
	
    private int pin=8765;//private access
    
    protected String name="Sravani";
    
    char a='M';
    
	public static void hey() {// methods 
		System.out.println("Hey 10Kcoders");
	}
	
	private static void hi() {// private method
		System.out.println("Hi Coders");
	}
	public static void main(String[] args) {
		Publicdemo1 obj=new Publicdemo1();
		System.out.println(obj.age);
		hey();	
		System.out.println(obj.pin);
		hi();
		System.out.println(obj.name);
		
	}

}
