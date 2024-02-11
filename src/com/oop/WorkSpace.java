
package com.oop;

public class WorkSpace {

		public static void main(String[] args) {
			//How to create an Object from Class
			//toyota has its own property.
			// non static variables can be accessed only by the class instansiation. like each toyota has name , color,.....
			// static is belongs to that class.
			// can not directly access them. 
			// static values are not changing based on the object. 
			
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
				//ObjectReferenceOfMethod.methodName()
				toyota.startCar();
				
				
				//ClassName.methodName();
				Car.turnOnLights();
				
				//non static create an object so it will directly call the non static methods.
				
				Car driveCar = new Car();
				driveCar.driveCar();
				
		
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
			
	public void turnOnLights() {
		System.out.println("Lights will turn on");
	}
		
		public void addNumbers() {
			int a=10; int b=20;
			System.out.println(a+b);
	}
		public  void div () {
			int a =10;
			int b =5;
			
			System.out.println(a/b);
		}
		public  void mul () {
			int a =10;
			int b =5;
			
			System.out.println(a*b);
		}

}
