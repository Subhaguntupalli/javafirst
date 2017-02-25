package com.subha.apps;

import com.subha.beings.Animal;
import com.subha.beings.Cat;
import com.subha.beings.Cow;
import com.subha.beings.Dog;
import com.subha.beings.Pet;

public class AnimalApp {
	public static void main(String[] args) {

		Animal aDog = new Dog();
		Animal bDog = new Dog();
		Animal aCat = new Cat();
		Animal bCat = new Cat();
		Animal aCow = new Cow();
		Animal bCow = new Cow();

		System.out.println("First Statement");
		aDog.says();
		bDog.says();
		aCat.says();
		bCat.says();
		aCow.says();
		bCow.says();
		System.out.println("Interfaces now");
		Pet aPet = new Dog();
		aPet.petable();
		Pet bPet = new Cat();
		bPet.petable();
	}
}