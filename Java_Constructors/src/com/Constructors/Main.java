package com.Constructors;

public class Main {

	String name;
	String lastName;
	int age;
	String phone;
	String email;

	public Main(String name, String lastName, int age, String phone, String email) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}

	public static void main(String[] args) {

		Main obj = new Main("Kamal", "Ahmadi", 35, "(925)232-3432", "Karim@gmail.com");
		System.out.println("Name:" + obj.name);
		System.out.println("Last Name:" + obj.lastName);
		System.out.println("Age:" + obj.age);
		System.out.println("Phone:" + obj.phone);
		System.out.println("Email:" + obj.email);

	}

}
