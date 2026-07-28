package com.coders.switchstatement;

public class SwitchStatement {
	public static void main(String[] args) {
		int days=8;
		switch(days) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;	
		case 3:
			System.out.println("tue");
			break;
		case 4:
			System.out.println("wed");
			break;
		case 5:
			System.out.println("thus");
			break;
		case 6:
			System.out.println("fri");
			break;
		case 7:
			System.out.println("Sat");
			break;
		default:
			System.out.println("Invalid");
			break;
		}
	}

}
