package com.coders.anstractiondemo1;

abstract class Car{
	public abstract void drive();
	public abstract void fly();
	
	public void playmusic() {
		System.out.println("Play music");
	}
}
class Wagonr extends Car{
	public void fly()
	{
		
	}
	public void drive() 
	{
		System.out.println("Driving");
	}
	
}
public class Dome1 {
	public static void main(String[] args) {
		Car obj=new Wagonr();
		obj.drive();
		obj.playmusic();
	}

}
