package com.Java_Class_Method;

public class Java_Class_Method_Static_vs_Public {
	
//You will often see Java programs that have either static or public attributes and methods.
//In the example above, we created a static method, which means that it can be accessed without creating an object of the class,
//	unlike public, which can only be accessed by objects.

//		Static Example:
	
	static void myStaticMethod() {
		System.out.println("Static methods can be called without creating objects");
	}
	
	
//	Public Example:
	
	public void myPublicMethod() {
		System.out.println("Public methods must be called by creating objects");
	}
	
	public static void main(String[] args) {
	
//		Static Call
		myStaticMethod();
		
//		Public Call
		Java_Class_Method_Static_vs_Public obj = new Java_Class_Method_Static_vs_Public();
		
		obj.myPublicMethod();
	}
}
