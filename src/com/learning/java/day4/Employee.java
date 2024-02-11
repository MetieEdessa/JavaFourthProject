package com.learning.java.day4;
//2/1/24
//Create a public employee class contain name, age, phonenumber as public,
public class Employee {
	
	
	//2
	public String name;
	public int age ;
	public int phonenumber;
	
		//3
	private double bonus;
	private double salary;
	
	protected int numberOfhours;
	
	//parameterized constructor with name and age,  salary.
	public void Employee(String name,int age ,int phonenumber ) {
		this.name = name;
		this.age = age;
		this.salary= salary;
	}
	//2 public methods
			public void mymethod1() {
				System.out.println("This is a private method");
			}
			public static void mymethod2() {
				System.out.println("method 2");
			}
			//1 private methods
			private void mymethod3() {
				System.out.println("method 1");

}//1 private static parameterized method
			private static void Employee1(String name,int age ,int phonenumber ) {
				System.out.println(name+age+phonenumber);
			}
	
			//1 public non static parameterized method
			public void Employee3(String name,int age ,int phonenumber ) {
				
				System.out.println(name + age + phonenumber);		
			}		
		//write a method to return the employee salary + bonus.
	public double Employee(){
		return this.salary + this.bonus;
	}
}
	
	
			
		
	
	

		
				
