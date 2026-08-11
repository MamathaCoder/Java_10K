package com.coders.publicaccess;

import com.coders.accessspecifiers.Publicdemo1;

public class Publicdemo2 {
	public static void main(String[] args) {
		Publicdemo1 obj=new Publicdemo1();
		System.out.println(obj.age);
		obj.hey();
		//System.out.println(obj.pin);
		//obj.hi();
		//System.out.println(obj.name);
	}
}
