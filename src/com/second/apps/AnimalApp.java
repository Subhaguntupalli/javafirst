package com.second.apps;

import com.second.beings.Animal;
import com.second.beings.Dog;
import com.second.beings.Cat;
import com.second.beings.Cow;

public class AnimalApp {
	public static void main(String[] args) {
		Animal aAnimal = new Animal();
		Animal bAnimal = new Animal();
		Dog aDog = new Dog();
		Dog bDog = new Dog();
		Cat aCat = new Cat();
		Cat bCat = new Cat();
		Cow aCow = new Cow();
		Cow bCow = new Cow();
		aAnimal.says();
		bAnimal.says();
		System.out.println("First Statement");
		aDog.says();
		bDog.says();
		aCat.says();
		bCat.says();
		aCow.says();
		bCow.says();
	}
}