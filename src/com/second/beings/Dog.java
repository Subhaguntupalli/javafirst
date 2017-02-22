package com.second.beings;

public class Dog extends Animal implements Pet {
	
	public void says() {
		System.out.println("BOW");
	}
	public void petable(){
		System.out.println("I'm a pet");
	}
	
}