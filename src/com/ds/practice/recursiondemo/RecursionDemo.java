package com.ds.practice.recursiondemo;

public class RecursionDemo {

	public static void main(String[] args) {
		
		System.out.println("factorial is: "+factorial(3));
	}

	private static int factorial(int i) {
		
		if(i<=0)
			return 1;
		
		return i*factorial (i-1);
	}

}
