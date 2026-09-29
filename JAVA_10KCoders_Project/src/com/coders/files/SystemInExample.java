package com.coders.files;

import java.io.IOException;

public class SystemInExample {
	public static void main(String[] args)throws
	IOException
	{
		System.out.println("Enter a characte");
		
		//Reads a single byte from System.in
		int data = System.in.read();
		
		//Print the character and ASCII value
		
		
		System.out.println("You enter:"+(char)data);
		System.out.println("ASCII value:"+data);
		
	}

}
