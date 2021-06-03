package com.java.practice;



interface Test{
	void tester();
}

public class Overloading implements Test{

	public static void main(String[] args) {
		Overloading obj = new Overloading();
	System.out.println(obj.add(12.1,12));
	}

	
	public int add(int a, int b) {
		System.out.println("executing int");
		return a+b;
	}
	
	public long add(long a, long b) {
		System.out.println("executing long");
		return a+b;
	}
	public double add(double a, double b) {
		System.out.println("executing double");
		return a+b;
	}


	@Override
	public void tester() {
		// TODO Auto-generated method stub
		
	}

}
