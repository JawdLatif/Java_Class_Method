package com.Constructors;

public class Constractor {

	int x;

	public Constractor(int x) {
		this.x = x;
	}

	public static void main(String[] args) {

		Constractor obj = new Constractor(35);
		System.out.println("Age:" + obj.x);

	}

}
