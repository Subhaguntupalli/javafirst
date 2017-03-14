package com.subha.examples;

public class PrimeNumbers {

	public static void Prme(String number)throws NotAValidInput {
		int count=0;
		try{
	         count = Integer.parseInt(number);
	    	}catch(NumberFormatException e){
	    		throw new NotAValidInput();
	    	}
	        
		    int i = 2, j = 2;

		while (count > i) {

			while (true) {
				if (i % 2 == 0) {
					break;
				}

				if (i % j == 0) {
					break;
				} else {
					j++;

				}

			}
			if (j == i) {
				System.out.print(" " + i);
				j = 2;
			}
			i++;
		}
	}

}