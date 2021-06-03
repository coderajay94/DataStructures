package com.ds.practice;

public class MultiplyWithRecursion {

	public static void main(String[] args) {
	
		System.out.println(multiply(15,6,1));

	}

	private static int multiply(int i, int j, int count ) {
		int sum = 0;
		if(count==j)
			return i;
		sum= sum+i;
		System.out.println("count: "+count++);
		return sum+multiply(i, j, count);
	}

}
