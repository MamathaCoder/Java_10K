package com.coders.decisionmaking;

public class DecisionMakingStatements {
	public static void main(String[] args) {
		int num=7;
		
		if(num>0) {
			System.out.println("num is a Positive"+ " "+ num);
		if(num==7){
			System.out.println("num is a "+ " "+ num);
		}
		}
		else if(num<=0) {
			System.out.println("num is Negative:"+ num);
		}
		else {
			System.out.println("Its a zero:"+ num);
		}
	}
}
