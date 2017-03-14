package com.subha.apps;

import com.subha.examples.KeyNotFound;
import com.subha.examples.LinearSearch;
import com.subha.examples.NotAValidInput;

public class LinearSearchApp {
     
    public static void main(String[] args){
         
    	
    	try {
    		System.out.println("Key "+args[0]+" found at index: "+LinearSearch.findKey(args[0]));
    	} catch (NotAValidInput e) {
			System.out.println("Hey! Please enter only integer");
		} catch (KeyNotFound e) {
            System.out.println("Sorry but the integer you are looking for is not in the Array");
		}
    }
}