package com.coders.multithreading;
//demo for Synchronization
public class Exmple {
	synchronized void display() {
		Thread g=Thread.currentThread();
		for(int i=0;i<=3;i++) {
			try {
				Thread.sleep(2000);
				System.out.println(g.getName()+" "+i);
			}
			catch(Exception e) {
				
			}
		}
	}
	

}
