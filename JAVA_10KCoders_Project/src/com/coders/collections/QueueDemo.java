package com.coders.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		
		//Creating a Priorityqueue of intergers
		
		Queue<Integer>pq =new PriorityQueue<>();
		
		//adding elements to the Priority queue 
		pq.add(40);
		pq.add(70);
		pq.add(20);
		pq.add(80);
		
		//Display 
		System.out.println("Priority Queue:"+pq);
	}

}
