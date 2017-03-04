package com.subha.beings;

public class Dog extends Animal implements Pet {
	
	public Dog() {
		this.noOfLegs =4;
	}
	public Dog(int noOfLegs) {
		this.noOfLegs =noOfLegs;
	}
	public void says() {
		System.out.println("BOW");

	}
	public void petable() {
		System.out.println("I am a pet");
	}
}
