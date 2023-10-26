package com.Java_Class_Method;

public class Java_Class_Method_Access_With_an_Object {
	public void fullThrottle() {
		System.out.println("The car is going as fast as it can!");
	}

	public void speed(String maxSpeed) {
		System.out.println("Max Speed is:" + maxSpeed);
	}

	public static void main(String[] args) {

		Java_Class_Method_Access_With_an_Object obj = new Java_Class_Method_Access_With_an_Object();

		obj.fullThrottle();

		obj.speed("200 mph");

	}

}
