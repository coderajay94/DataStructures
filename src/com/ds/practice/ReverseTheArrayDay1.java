package com.ds.practice;

public class ReverseTheArrayDay1 {

	public static void main(String args[]) {
		
		int[] arr = new int[] {1,23,2,7,56,32,45};
		System.out.println(arr);
		for(int element:arr) {
			System.out.print(" "+element);
		}
		System.out.println();
		//reverseTheArray(arr);
		reverseUsingRecursion(arr,0, arr.length-1);
		
		for(int element:arr) {
			System.out.print(" "+element);
		}
		
	}

	private static void reverseTheArray(int[] arr) {
		int len = arr.length;
		for(int i=0;i<len/2;i++) {
			swap(arr,i,len-1-i);
			
		}
		
	}
	
	private static void reverseUsingRecursion(int arr[], int start, int end) {
		
		if(start>=end)
			return;
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		reverseUsingRecursion(arr,start+1,end-1);
		
		
	}
	

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
