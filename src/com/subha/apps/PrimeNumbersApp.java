package com.subha.apps;

import com.subha.examples.NotAValidInput;
import com.subha.examples.PrimeNumbers;

public class PrimeNumbersApp {
			 
		    public static void main(String[] args) {
		    	try {
		    		PrimeNumbers.Prme(args[0]);
				} catch (NotAValidInput e) {
					System.out.println("Hey! Please enter only integer");
				}
}
}
