package com.coders.arrays;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//user input
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		//deifinign array
		int numbers[][]=new int[rows][cols];
		
		//input 
		//rows
		for(int i=0;i<rows;i++) {
			//clos 
			for(int j=0;j<cols;j++) {
				numbers[i][j]=sc.nextInt();
				
			}
		}
		//output
		for(int i=0;i<rows;i++) {
			//clos 
			for(int j=0;j<cols;j++) {
				System.out.print(numbers[i][j]+ " ");
				
			}
			System.out.println(" ");
		}
	}

}
