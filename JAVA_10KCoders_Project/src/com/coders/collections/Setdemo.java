package com.coders.collections;

import java.util.HashSet;
import java.util.Set;

public class Setdemo {
	public static void main(String[] args) {
		//creating a set using Hashset
		
		Set<String> s=new HashSet<>();
		
		//add elements 
		s.add("hey");
		s.add("he");
		s.add("mw");
		//Display the set
		
		System.out.println("Set elements :"+s);
		
		//access the element
		
		String s1="he";
		
		System.out.println("Contrains"+s+" "+(s1));
		
		
	}

}
