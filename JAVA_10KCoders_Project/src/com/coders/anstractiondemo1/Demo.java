package com.coders.anstractiondemo1;


abstract class TV{
	abstract void turnOn();
	abstract void turnOff();
}

class TVRemote extends TV{
	@Override
	void turnOn() {
		
		System.out.println("Tv is turned on");
	}
	@Override 
	void turnOff() {
		System.out.println("Tv is turned off");
		
	}
}
public class Demo {
	public static void main(String[] args) {
		TV remote=new TVRemote();
		remote.turnOn();
		remote.turnOff();
		
	}

}
