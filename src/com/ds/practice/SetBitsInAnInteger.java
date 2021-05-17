package com.ds.practice;

public class SetBitsInAnInteger {

public static void main(String args[]) {
		
		int n =6;
		
		System.out.println("set bits: "+setBits(n));
		
		
	}

private static int setBits(int n) {
	int count = 0;
	
	while(n>0) {
		if((n&1)==1) {
			count++;
		}
		n=n>>1;
	}
	return count;
}


	}
