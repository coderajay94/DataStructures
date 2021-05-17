package com.ds.practice;

public class MaxAndMinInArrayDay1 {

public static void main(String args[]) {
		
		int[] arr = new int[] {-11,-57,7,56,32,45,88,34,-2,-100};
		System.out.println(arr);
		for(int element:arr) {
			System.out.print(" "+element);
		}
		System.out.println();
		
		//function here  
		//maxAndMinElement(arr);
		maxAndMinElementCurl(arr);
		
		
		
		
	}

private static void maxAndMinElementCurl(int[] arr) {
	
	int count = 0;
	int max = arr[0];
	int min = arr[0];
	int len = arr.length;
	
	
	if(len%2==1) {
		System.out.println("odd number with length:"+len);
		max = arr[(len-1)/2];
		min = arr[(len-1)/2];
		System.out.println("odd number with max"+ max);
	}
	
	for(int i=0;i<len/2;i++) {
		
		count++;
		if(arr[i]>max)
			max=arr[i];
		if(arr[len-i-1]>max)
			max= arr[len-i-1];
		
		if(arr[i]<min)
			min=arr[i];
		if(arr[len-i-1]<min)
			min= arr[len-i-1];
	}
	System.out.println("max "+max+" and min:"+min);
	System.out.println("Comparisons Count: "+count);
	
	
}

private static void maxAndMinElement(int[] arr) {
	int count =0;
	int max = arr[0];
	int min= arr[0];
	
	for(int i=0;i<arr.length;i++) {
		count++;
		if(arr[i]>max)
			max = arr[i];
		
		if(arr[i]<min)
			min=arr[i];
	}
	
	System.out.println("max "+max+" and min:"+min);
	System.out.println("Comparisons Count: "+count);
	
	
}


	}
