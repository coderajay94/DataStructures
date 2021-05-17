package com.ds.practice;

import java.util.Arrays;

public class SortArrayElements012Day2 {

	public static void main(String args[]) {

		int[] arr = new int[] { 11, 90, 2, 10, 2, 31 };
		//int[] arr = new int[] { 1, 0, 2, 0, 2, 1 };
		// int[] arr = new int[] {1,0,0,0,1,1,0};
		System.out.println(arr);
		for (int element : arr) {
			System.out.print(" " + element);
		}
		System.out.println();

		//sort(arr);
		sortAlgo(arr,arr.length);
		Arrays.sort(arr);
		for (int element : arr) {
			System.out.print(" " + element);
		}

	}

	private static void sortAlgo(int[] arr, int n) {
		for(int i=0;i<n-1;i++){
	           for(int j=i+1;j<n;j++){
	              
	               if(arr[i]>arr[j])
	               {
	                   System.out.println("i:"+i+" and j:"+j);
	                   int temp = arr[i];
	                    arr[i]=arr[j];
	                    arr[j]=arr[i];
	               }
	           }
	       }
		
	}

	private static void sort(int[] arr) {
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;

		for (int i : arr) {
			if (arr[i] == 0)
				count0++;
			if (arr[i] == 1)
				count1++;
			if (arr[i] == 2)
				count2++;
		}

		for (int i = 0; i < arr.length; i++) {
			//System.out.println("******count 0:" + count0 + " count1:" + count1 + " count2:" + count2);

			if (count0 != 0) {
				arr[i] = 0;
				count0--;
			} else if (count1 != 0) {
				arr[i] = 1;
				count1--;
			} else if (count2 != 0) {
				arr[i] = 2;
				count2--;
			}
			//System.out.println("------count 0:" + count0 + " count1:" + count1 + " count2:" + count2);

		}

	}

}
