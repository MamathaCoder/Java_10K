package com.coders.arrays;
import java.util.*;
public class Arrays2D {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		
		int[][] numbers=new int[rows][cols];
		
		//rows input 
		for(int i=0;i<rows;i++) {
			//cols
			for(int j=0;j<cols;j++) {
				numbers[i][j]=sc.nextInt();
			}
		}	
			
			//rows output 
			for(int i1=0;i1<rows;i1++) {
				//cols
				for(int j=0;j<cols;j++) {
					System.out.print(numbers[i1][j]+" ");
				}	
				System.out.println(" ");
			}			

    }
}