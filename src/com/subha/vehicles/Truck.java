package com.subha.vehicles;


public class Truck extends Vehicle implements Favorite{
	
	public void myname() {
		System.out.println("Truck");
	}
	public void myFavorite(){
		System.out.println("My Favorite Truck");
	}
}