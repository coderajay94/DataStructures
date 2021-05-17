package com.ds.practice;

public class SwapUsingBits {

public static void main(String args[]) {
		
		int a =6;
		int b=3;
		
		System.out.println("swap numbers a and b: "+a+" and "+b+" are ");
		swapBits(a,b);
		
		
	}

private static void swapBits(int a, int b) {
		 a = a^b;
		 b= a^b;
		 a= a^b;
		 
		 
		 System.out.println("swapped numbers a and b: "+a+" and "+b+"  ");
	
	
}


	}
