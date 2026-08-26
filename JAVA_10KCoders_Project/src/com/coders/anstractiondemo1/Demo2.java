package com.coders.anstractiondemo1;

abstract class Car1{
	abstract void drive();
	
	void musicplaying() {
		System.out.println("Play music");
	}
	
}

class Bmw extends Car1
{
	public void fly()
	{
		System.out.println("Car is flying");
	}
	public void drive() 
	{
		System.out.println("Driving");
	}
}



public class Demo2 {
	public static void main(String[] args) {
		Car1 obj=new Bmw();
		obj.drive();
		obj.musicplaying();
		((Bmw) obj).fly();
	}

}
