package com.java.practice;


  interface inter{
	  int x=10;
	public void m1();
}
interface inter2{
	int x=20;
	void m1();
}


abstract class A{
	int x;
	
	public A() {
		System.out.println("construcctor called");
	}
}

class P{
	public void m1() {
		System.out.println("hello from m1");
	}
}

class C extends P{
	public void m2() {
		System.out.println("hello from m2");
	}
}

public class InterfaceTesting extends A{

	public static void main(String args[]) {
		InterfaceTesting obj = new InterfaceTesting();
		System.out.println("x: "+obj.x);
		
		P p = new C();
		p.m1();
		
		
	}
	
	public void m1() {
		System.out.println("m1 main method called");
		
	}
}
