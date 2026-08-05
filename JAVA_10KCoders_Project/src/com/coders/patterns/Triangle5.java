package com.coders.patterns;

public class Triangle5 {
	public static void main(String[] args) {
		int n=5;
		//outer loop
		for(int i=n;i>=1;i--) {
			//inner loop
			//for spaces
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			//for star printing 
			for(int j=0;j<=n-i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}	
	}
}