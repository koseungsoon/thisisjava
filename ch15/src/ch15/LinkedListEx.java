package ch15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		
		long startTime;
		long endTime;
		
		
		List<String> arrLists=new ArrayList<String>();
		
		List<String> linkedLists=new LinkedList<String>();
		
		startTime = System.nanoTime();
		for(int i = 0 ; i<10000 ; i++) {
			arrLists.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		
		System.out.println("arraylist 걸린시간:  "+ (endTime-startTime));
		
		startTime = System.nanoTime();
		for(int i = 0 ; i<10000 ; i++) {
			linkedLists.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		
		System.out.println("linkedlist 걸린시간: "+ (endTime-startTime));   

		
		
		
		
		
	}

}
