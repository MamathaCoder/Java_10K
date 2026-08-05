package com.coders.breakandcontinue;

public class BreakandContinue1 {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
		
			if(i==5)
				break;//stop the loop or jump out of the loop
			System.out.println("break");
			if(i%2==0)
				continue;//exit the loop in present 
			System.out.println("continue");
		System.out.println(i);
		}
	}	
}