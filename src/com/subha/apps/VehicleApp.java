package com.subha.apps;

import com.subha.vehicles.Vehicle;
import com.subha.vehicles.Bus;
import com.subha.vehicles.Car;
import com.subha.vehicles.Truck;
import com.subha.vehicles.Favorite;

public class VehicleApp {
	public static void main(String[] args) {

		Vehicle aTruck = new Truck();
		Vehicle bTruck = new Truck();
		Vehicle aCar = new Car();
		Vehicle bCar = new Car();
		Vehicle aBus = new Bus();
		Vehicle bBus = new Bus();

	
		aTruck.myname();
		bTruck.myname();
		aCar.myname();
		bCar.myname();
		aBus.myname();
		bBus.myname();
		System.out.println("Interfaces now");
		Favorite aFav = new Truck();
		aFav.myFavorite();
		Favorite bFav = new Car();
		bFav.myFavorite();
		Favorite cFav = new Bus();
		cFav.myFavorite();
	}
}