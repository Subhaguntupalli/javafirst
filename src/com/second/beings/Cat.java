package com.second.beings;

public class Cat extends Animal implements Pet {
	
	public void says() {
		System.out.println("Meow");
	}
	
	public void petable(){
		System.out.println("Hey I'm a nice pet");
	}
}