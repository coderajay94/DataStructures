package com.ds.practice;

import java.util.Arrays;
import java.util.List;

public class JavaPractice {

public final static void main(String[] args) {
	
	int a = 0xBee;
	  double d = 0123.23;
	  String s = String.valueOf(a);
	 
	  
	  char g = 123;
	 
	  System.out.println(g);
	
	  int[][] a1, b1; //a1=2;b1=2
	  int[] c1,d1[];//c1=1;d1=2;
	  int[][] e1,f1[];//e1=2;f1=3;
	  
	  //int[] ar = new int[2147483647];	  
	  
	  int[][] ar1 = new int[3][];
	  ar1[0] = new int[1];
	  ar1[1] = new int[3];
	  ar1[2] = new int[4];
	  
	  
	  int[] ar2 = new int[5];
	  System.out.println(ar2);
	  int[] ar3 = {12,234,3242,32,23};
	  List<int[]> list = Arrays.asList(new int[] {112,2,12,3});
	  int[][] matrix = {{12},{12}};
	  
	  Number[] nums= new Number[5];
	  
	  nums[0] = new Integer(10);
	  nums[1] = new Double(3);
	  
	  Runnable[] r = new Runnable[1];
	  r[0] = new Thread();
	  
	  Employee employee= new Employee();
	  System.out.println(employee.callCount(1,2,3,4));
	  
	  
	  byte b=10;
	  //b=b+1; any number is integer by default
	  b++;System.out.println("b:"+b);
	  
	  byte h=10;
	  byte e=10;
	  //byte f= h+e; //max(int,type of h, type of e)
	 // System.out.println("f:"+f);
	  
	  long h1=10l;
	  long g1=10l;
	  long f11= h1+g1;
	  System.out.println("f11:"+f11);
	  
	  //divide by 0 will lead to arithmatic exception
	  //but in case of fload and double we have variable Double.POSITIVE_INFINITY or NEGATIVE_INFINITY
	  System.out.println(10.0/0);
	  
	 // System.out.println(0/0);->java.lang.ArithmeticException
	  System.out.println(0.0/0); //NaN will be given, 
	  System.out.println(Math.sqrt(-4));
	  
	  //concatination operators +
	  //relational operators >,<,>=,<=
	  //equality operators ==,!=
	  //instanceof operator i instanceof Object
	  //bitwise operators |, &
	  
	  System.out.println(h+e+"hello"+h1);
	 	Integer i = new Integer(1);
	 boolean bool= (i instanceof Number);
	 Thread t = new Thread();
	 System.out.println(t instanceof Thread);
	 //bitwise operators - can be applied for integral data types
	 System.out.println(4&5); //100+101 = 100 and if both of the operands are active
	 System.out.println(4|5); //100+101 = 101 or if any of the operand is active
	 System.out.println(4^5); //100+101 = 001 x-or if both operands are different
	 System.out.println(false^true);
	 //boolean complement operator - can only be appiled for boolean types
	 System.out.println(!true);
			 
	 //bitwise complement operator - can only be appiled for integral types
	 System.out.println(~11); //1's compliment
	 System.out.println(!true);

	 //implicit type casting also know as widening//upcasting
	 short shor = 12;
	 int in = shor;//automatically type casting happens
	 
	 //explicit type casting//
	 short sh = 129;
	 byte by = (byte) sh;
	 System.out.println(by);

	 //only ternary operator- conditional operator
	System.out.println(sh>12?sh:12);
}

}
 class Employee{
	
	int count;
	static int counts;
	
	public int callCount(int ...args) {
		//var args is implemented internally based on the arrays concept
		for(int k:args)
			count=count+k;
		int s;
		System.out.println("hello");
		s=20;
		return count+1;
	}
	
	
}