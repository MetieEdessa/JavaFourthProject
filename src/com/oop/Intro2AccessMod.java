package com.oop;

public class Intro2AccessMod {

	public static void main(String[] args) {
		// public
		// access modifiers
		//1 public
		//2 private
		//3 default
		//4 protected
		
		//1. public is a key word. use as access modifier.it is used to set the access level for class, attributes, methods and constructors. is accessuble by other classes.
//2. private it can only be accessible within that particular class. we can not access these outside of class.
		//3. Default - it can only be accessible within that particular package. we can not access these outside of package.
		//4. Protected - it can only be accessible within that particular package and subclasses. we can not access these outside of package and subclasses
		
		// Non access Modifiers:
		//1. Final
		//2. Static it belongs to that particular class.args
		//3.Abstract
		//4. transient
		//5. synchronized
		//6. Volatile
		
		//4 pilars of oop
		
		//Encapsulation : protect the data from an permited person. to do that we use private methods , and validations . only for private attributes. 
		//	1 declear class variables/attributes as private.
		//	2 we will set a set get method to access or update the values of private variables.
		//source, generate geters and seter
		
		//Inhuritance
		// it is possible to inherit attibutes and methods from one class to another.
			//1. Subclass or Child class - class that inherits from another class. (This will be parent class or super class for this child or sub class.
			//2. superclass or parent class.
		//to inherit from one class to another class, we will use keyword called "Extends"
	//	Cat -> Tiger and normal cat
		//class Cat{
			
	//	}
		
		//class tiger extends cat{
			
	//	}

	//six types of inheritance
// Single inheritance a->B

//multi level inheritancethe cheking acc. inherit from account ,and sving acc from the checking.  a->b->c


//multiple inheritance A,B==>C
//classes does not support (diff. classes has different interest rate so the class dont know which class to take so its not supported multiple classes.) A,B==>C

//Multipath inheritance 
	//- A-B
	//A->C
	//B,C->D
	//classes does not supported Multipath inh. by java

//Hierarchical inheritance One parent and multiple child
		//A->B
		//A->c
		//A->D

// hybrid inheritance. (single inheritance with multiple inheritance)
		//A->B
		//B->C
		//B->D


		
		//polimorpisem means "many forms"



	//Abstraction is the process of hiding certain details and showing only essential information to the user.
			//1. by using abstract classes 
			//2. by using Interfaces.

				//Abstract class start with using key word "Abstract" it is restricted. 
					//you can not create object class using abstract class.
				// Abstract methods can only be used in Abstract class.
				// Abstract methods has no  body.
				// Abstract class can have both regular methods and abstract methods.
				
		


		
		
		
	}

}
