package com.ds.practice;

public class MoveNegativeElementsOneSideDay3 {

public static void main(String args[]) {
		
		int[] arr = new int[] {-1,-23,2,7,56,-32,-45};
		System.out.println(arr);
		for(int element:arr) {
			System.out.print(" "+element);
		}
		System.out.println();
		
		moveNegativeElements(arr);
		
		
		for(int element:arr) {
			System.out.print(" "+element);
		}
		
	}

private static void moveNegativeElements(int[] arr) {
	int start = 0;
	int end = arr.length-1;
	
	while(end>start) {
		if(arr[start]<0)
			start++;
		if(arr[end]>0)
			end--;
		if(arr[start]>0 && arr[end]<0)
		{
			int temp = arr[start];
			arr [start]=arr [end];
			arr[end]=	temp;
		}
	
	}
	
	
}

public static void swap(int arr[], int i, int j)
{
	int temp = arr[i];
	arr [i]=arr [j];
	arr[j]=	temp;
	
}

	}
