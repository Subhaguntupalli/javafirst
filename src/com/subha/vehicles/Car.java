package com.subha.vehicles;

public class Car extends Vehicle  implements Favorite{
	
	public void myname() {
		System.out.println("car");
	}
	
	public void myFavorite(){
		System.out.println("My Favorite Car");
	}
}