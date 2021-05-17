package com.ds.practice;

public class DutchNationalFlagDay2 {

public static void main(String args[]) {
		
		int[] arr = new int[] {0,1,1,1,1,1,0,1,0,0,1,1,0};
		System.out.println(arr);
		for(int element:arr) {
			System.out.print(" "+element);
		}
		System.out.println();
		
		sortZeroAndOnes(arr);
		
		for(int element:arr) {
			System.out.print(" "+element);
		}
		
	}

private static void sortZeroAndOnes(int[] arr) {
	
	int start =0;
	int end = arr.length-1;
	
	while(end>start) {
		
		if(arr[start]==0)
			start++;
		if(arr[end]==1)
			end--;
		if(arr[start]==1 && arr[end]==0) {
			arr[start]=0;
			arr[end]=1;
			start++;
			end--;
		}
		
	}
	
	
}


	}
