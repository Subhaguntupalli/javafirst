package com.subha.beings;

public abstract class Animal {

	protected int noOfLegs;
	
//	public Animal(){
//		this.noOfLegs=4;
//	}
//	public Animal(int noOfLegs){
//		this.noOfLegs = noOfLegs;
//	}

	public abstract void says();
	
	public int getNoOfLegs() {
		return noOfLegs;
	}
	
	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
}