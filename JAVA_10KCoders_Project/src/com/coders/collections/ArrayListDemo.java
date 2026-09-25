package com.coders.collections;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo{
	public static void main(String[] args) {
		//Creating a list of string using arrayList(Dynamic array)
		List<String> list=new ArrayList<>();
		
		//Adding elements to the ArrayList
		
		list.add("Java");
		list.add("C++");
		list.add("C");
		
		//Printing the elements of the ArrayList
		
		System.out.println("Programming Languages:");
		
		//Enhanced for the loop to iteration through the list
		
		for(String lang:list) {
			System.out.println(lang);
		}
		
	}

}
