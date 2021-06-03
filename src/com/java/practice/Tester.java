package com.java.practice;


class Tester {

	static int x=20;
	int y =20;
	
	public static void main(String[] args) {
		System.out.println("calling from Tester class");
		
	}
	
	void add() {
		x= x+10;
		
	}

}
class B extends Tester{
	
	
}


