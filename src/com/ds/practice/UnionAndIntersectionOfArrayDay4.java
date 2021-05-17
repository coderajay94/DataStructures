package com.ds.practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UnionAndIntersectionOfArrayDay4 {

public static void main(String args[]) {
		
		byte val = (byte) 129;
		System.out.println(val);
	
		int[] arr = new int[] {1,23,2,7,56,32,45};
		int[] arr2 = new int[] {1,22,2,9,50,32,45};
		System.out.println(arr);
		for(int element:arr) {
			System.out.print(" "+element);
		}
		System.out.println();
		for(int element:arr2) {
			System.out.print(" "+element);
		}
		System.out.println("----------");
		
		unionArray(arr,arr2);
		
		
		
	}

private static void unionArray(int[] arr, int[] arr2) {
	Set<Integer> set1 = new HashSet<>();
	Set<Integer> set2 = new HashSet<>();
	for(int i:arr) {
		set1.add(i);
	}
	for(int j:arr2) {
		set1.add(j);
	}
	
	for(int j:arr2) {
		set2.add(j);
	}
	
	set1.retainAll(set2);
	
	  Iterator<Integer> itr = set2.iterator();
	  while(itr.hasNext()) {
		  System.out.print(itr.next()+" ");
	  }
	
	  
	  
	  
}


	}
