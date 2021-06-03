package com.ds.practice;

import java.util.HashMap;

public class SumOfTwoNumbers {

public static void main(String args[]) {
		
		int[] arr = new int[] {1, 2, 0, 3, 0, 0};
		System.out.println(arr);
		for(int element:arr) {
			System.out.print(" "+element);
		}
		System.out.println();
		
		canReach(arr);
		
		
		
	}


static int canReach(int[] A) {
    
    int len = A.length-1;
    int i=0;
    int lastIndex = len;
    while(i<=lastIndex){
    	System.out.println("i: "+i);
        if(A[i]>=lastIndex)
        return 1;
        else if(A[i]==0)
        return 0;
        else
        i= i+A[i];
        
    }
   return 0; 
}




private static int[] getIndeces(int[] arr, int target) {
	HashMap<Integer, Integer> map = new HashMap<>();
	
	for(int i=0;i<arr.length;i++) {
		if(map.containsKey(target-arr[i])) {
		return new int[] {i, map.get(target-arr[i])};
		}else {
			map.put(arr[i], i);
		}
		
		
	}
	
	return new int[] {};
}


	}
