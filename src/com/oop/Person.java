package com.oop;

public class Person {
String name;
int age;
String dob;
double salary;

//Empty Constructor //eg. if you want to create empty person 
//public person(){
//	
//static int no_of_eyes =2;
static int no_of_legs =2;
static boolean Merry = true;
//}


//Parameterized Constructor
public Person(int ageInput, String nameInput, String dobInput, double salaryInput) {
String name =nameInput;
int age =ageInput;
String dob = dobInput;
double salary=salaryInput;
}
	public static void main(String[] args) {
		Person Metie = new Person(33, "Metie", "", 0.0 );
		
	//	Person pavani = new Person()new person created. empty constructor created. so you can creat your own constructors, like above (empty con)
		
		System.out.println(Metie.name);

	}
}
