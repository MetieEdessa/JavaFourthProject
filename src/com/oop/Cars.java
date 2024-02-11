package com.oop;

public class Cars {

	
		//attributes of a cars. 
	//non static belonges to the instance of that specific  class. for a particular object.
	
		String name; //create a variable with no value. 
		String color;
		String model;
		int mfgyear;
		int milage;
		
		static int noOfWheels=4; // static values are not changing based on the object.  
		
		public static void main(String[] args) { // when it is static it belonges to that class.
		
	}
		public void turnOnLights() {
			System.out.println("Lights will turn on");
			
		}
		public void driveCar() {
		System.out.println("In drive mode");
		}
		public void startCar() {
			
		}

}
