package com.ds.practice.recursiondemo;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 12, 3, 5, 1, 34, 22, 67, 14 };
		int[] aux = new int[arr.length];
		//System.out.println(arr.length +" "+aux.length );

		mergeSortAlgo(arr, aux, 0, arr.length-1);
		Arrays.stream(arr).forEach(System.out::println);

	}

	private static void mergeSortAlgo(int[] arr, int[] aux, int low, int high) {

		int mid = (low + high) / 2;
		if (low == high)
			return;
		
		//System.out.println("low: "+low+" and mid "+mid+"and high"+high);
		System.out.println("first");
		mergeSortAlgo(arr, aux, low, mid);
		System.out.println("second");
		mergeSortAlgo(arr, aux, mid + 1, high);

		System.out.println("low: "+low+" and mid "+mid+" and high "+high);
		merge(arr, aux, low, mid, high);

	}

	private static void merge(int[] arr, int[] aux, int low, int mid, int high) {
		// k is for aux array, so it should start with low always
		int k = low, i = low, j = mid + 1;
		// mid and high are the last element of the sub arrays, mid for the first
		// subarray and last for second
		System.out.println("started while loop");
		while (i <= mid && j <= high) {
			
			if (arr[i] <= arr[j]) {
				System.out.println("inside while loop first condition");
				aux[k++] = arr[i++];
			} else {
				System.out.println("inside while loop second condition and k+"+k+ " and j:"+j);
				aux[k++] = arr[j++];
				System.out.println("aux length"+aux.length);
			}
			System.out.println("exiting while loop");
		}
		System.out.println("crossed while loop");
		// now move the left elements in the sub array, one of them will be competely
		// exhausted so move other to aux array
		// first sub array remaining elements
		while (i <= mid) {
			aux[k++] = arr[i++];
			System.out.println("remaining i");
		}
		// second sub array remaining elements
		while (j <= high) {
			aux[k++] = arr[j++];
			System.out.println("remaining j");
		}

		// update the aux array elements into main array
		System.out.println("low : "+low +" and high "+high);
		for (int v = low; v <= high; v++) {
			arr[v] = aux[v];
			System.out.println("update aux");
		}

	}

}
