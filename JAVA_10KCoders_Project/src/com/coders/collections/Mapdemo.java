package com.coders.collections;

import java.util.HashMap;
import java.util.Map;

public class Mapdemo {
	public static void main(String[] args) {
		
		Map<String,Integer> m=new HashMap<>();
		
		m.put("Hey 10k",2);
		m.put("Hey",3);
		m.put("Hey you",5);
		m.put("Hey who is this?",2);
		
		System.out.println("Map elemts:"+m);
		
	}

}
