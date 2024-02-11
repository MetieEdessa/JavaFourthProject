package com.oop;

public class Calculator {
	
//1/31/24
	
	public  void div () {
		int z =10;
		Calculator.w=12;
		System.out.println(Calculator.z / Calculator.w);
	}
	public  void mult () {
		Calculator.z =10;
		Calculator.w=12;
		System.out.println(Calculator.z * Calculator.w);
	}
	public static void main(String[] args) {
		//calling methods for the execution other wise java wont understand the execution message.
		//if static you can directly access them. 
		
		//static
		Calculator.add();
		Calculator.sub();
		System.out.println(Calculator.z);
		System.out.println(Calculator.w);}
		
		//non-static
		public void calc2(){
		Calculator calc2=new Calculator();
		System.out.println(calc2);
	}
		int x;
		int y;
		
	//	two static variable
		
		static int z=10;
		static int w=12;
		
		
		
		//create  two static method
		
	public static void add() {//  static variable
		Calculator.z =10;
		Calculator.w=12;
		System.out.println(Calculator.z + Calculator.w);}
	
	public static void sub() {
		Calculator.z =1;
		Calculator.w=12;
		System.out.println(Calculator.z - Calculator.w);

	}

}
