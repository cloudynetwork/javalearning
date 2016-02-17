package tut51;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		/**
		 * ArrayLists manage arrays internally. 
		 * [0][1][2][3]...
		 */
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		/*
		 * LinkedList consists of element where each element has a ref to the previous and next element. 
		 */
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
		
		}
	
	private static void doTimings(String type, List<Integer> list) {
		
		long start = System.currentTimeMillis();
		
//		for(int i=0; i<1E5; i++) {
//			list.add(i);
//		}
		
		
		//Add at beginning of list
		for(int i=0; i<1E5; i++) {
			list.add(0, i);
		}
		
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken: " + (end - start) + " ms for " + type);
	}
}
