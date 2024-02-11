package com.oop;

public  class Car { //template for an object
//	//attributes are declared with in a class. It is also called variables with in a class.
String name;
String color;
String model;
int mfgyear;
int milage;

	public static void main(String[] args) {
		
		
		// non???? static variables can be accessed only by the class instansiation. like each toyota has name , color,.....
		// static is belongs to that class.
		// if static you can directly access them. 
		// static values are not changing based on the object. 
		// static method work as a main method and .
		// if you add a key work called final in your static method no one can change it.
		
		//How to create an Object from Class
		//toyota has its own property.
		
		Car toyota = new Car(); 
			toyota.name ="x";
			toyota.model="Gx";
			toyota.color="white";
			toyota.milage=100;
			toyota.mfgyear=2024;
		
		Car acura = new Car();
			acura.name ="y";
			acura.model="mdx";
			acura.color="red";
			acura.milage=100000;
			acura.mfgyear=2025;
			
			//How to call a Method
			//ObjectReferenceOfMethod.methodName();
			toyota.startCar();
			
			
			//How to call a static Method is by calling the class name and method name.
			//ClassName.methodName();
			Car.turnOnLights();	
			
			
			
}

//public void methodName(){
//body of Method
//}

public void driveCar() { //methodName
	System.out.println("This car is in Drive model");//body of Method
	
}
public void startCar() { //methodName
	System.out.println("Start the Car"); //body of Method
	
}	
		
public static void turnOnLights() {
	System.out.println("Lights will turn on");
	
	}
public void addNumbers() {
	int a=10; int b=20;
	System.out.println(a+b);
}

}
