package com.second.apps;

import com.second.beings.Animal;
import com.second.beings.Cat;
import com.second.beings.Cow;
import com.second.beings.Dog;
import com.second.beings.Pet;

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