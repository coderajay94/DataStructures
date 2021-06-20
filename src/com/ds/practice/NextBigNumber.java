package com.ds.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NextBigNumber {

	public static void main(String args[]) {

		int[] arr = new int[] {1, 2, 3, 6, 5, 4};
		//System.out.println(arr);
		for (int element : arr) {
			//System.out.println(" " + element);
		}
		

		List<Integer> list = nextPermutation(arr.length, arr);

		for (int element : list) {
			System.out.print(" " + element);
		}

	}

	private static List<Integer> nextPermutation(int length, int[] arr) {
		int len = arr.length - 1;
		int i = 0, j = 0;
		for (i = len - 1; i >= 0; i--) {
			if (arr[i + 1] > arr[i])
				break;
		}
		//System.out.println(i);
		int min = i + 1;
		//System.out.println(min);
		for (j = i + 1; j <= len; j++) {
			//System.out.println("arr j"+arr[j]+" and i"+arr[i]);
			if (arr[j] > arr[i] && arr[min] > arr[j]) {
				min = j;
			//System.out.println("min "+arr[j]+" and "+min);
			}
		}
		//System.out.println(min);
		
		arr[i] = arr[i] ^ arr[min];
		arr[min] = arr[i] ^ arr[min];
		arr[i] = arr[i] ^ arr[min];
		
		Arrays.stream(arr).forEach(System.out::print);
		System.out.println("start:"+(i+1) +" and ends:"+len);
		Arrays.sort(arr, i+1, arr.length);
		System.out.println();
		Arrays.stream(arr).forEach(System.out::print);
		
		List<Integer> list = Arrays.stream(arr)     // IntStream 
        .boxed()        // Stream<Integer>
        .collect(Collectors.toList());
		return list;

	}

}
