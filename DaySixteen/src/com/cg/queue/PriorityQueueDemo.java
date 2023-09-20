package com.cg.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		Queue<String> pq = new PriorityQueue<>();
		pq.add("core Java");
		pq.add("React");
		pq.add("hTML");
		pq.add("Angular");
		
		System.out.println(pq);
		System.out.println(pq.size());
		
		Iterator<String> iterator = pq.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		
		System.out.println(pq);
	}

}
