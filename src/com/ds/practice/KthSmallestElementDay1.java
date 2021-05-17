package com.ds.practice;

public class KthSmallestElementDay1 {

	public static void main(String args[]) {

		int[] arr = new int[] { 1, 23, 2, 7, 56, 32, 45,51,88,12 };
		System.out.println(arr);
		for (int element : arr) {
			System.out.print(" " + element);
		}
		System.out.println();

		kthSmallestElement(arr, 6 , arr.length);

		for (int element : arr) {
			System.out.print(" " + element);
		}

	}

	private static void kthSmallestElement(int[] arr, int k, int length) {

		// Arrays.sort(arr);
		System.out.println(k + "th elemnent:" + quickSort(arr, k));

		// System.err.println(k+"th smallest element is:"+arr[k-1]);
	}

	public static int quickSort(int[] arr, int k) {
		int iterations = 0;
		int smallest = 0;
		if(arr.length>k) {
		for (int i = 0; i < arr.length - 1; i++) {
			iterations++;
			for (int j = i + 1; j < arr.length; j++) {
				iterations++;
				if(arr[i]>arr[j])
					swap(arr,i,j);
				
				if (i == k - 1) {
					System.out.println("total comparisons:"+iterations);
					return arr[i];
			}
			}
		}
		}else {
			System.out.println("kth should be smaller then the lenght of the array");
		}
		System.out.println("total comparisons:"+iterations);
		return smallest;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}

}
