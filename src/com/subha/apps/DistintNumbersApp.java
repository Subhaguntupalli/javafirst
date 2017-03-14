package com.subha.apps;

import com.subha.examples.DistinctNumbers;
import com.subha.examples.NotAValidInput;

public class DistintNumbersApp {
			 
		    public static void main(String[] args) {
		    	
		    
		        try{
		          
		        	
				      DistinctNumbers.printDistinctElements(args);
		        	 
		    } catch (NotAValidInput e) {
				System.out.println("Hey! Please enter only integer");
			}
		}
	}