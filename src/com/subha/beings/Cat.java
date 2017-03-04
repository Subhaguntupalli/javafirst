package com.subha.beings;

public class Cat extends Animal implements Pet {
	
	public Cat() {
	  // do the things that you want to do at the creation of the Cat class
		
	}

	@Override
	public void says() {
		System.out.println("MEOW");
	}

	@Override
	public void petable() {
		// TODO Auto-generated method stub
		System.out.println("I am a pet");
	}

}
