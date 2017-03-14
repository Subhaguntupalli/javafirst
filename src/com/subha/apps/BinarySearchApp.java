package com.subha.apps;

import com.subha.examples.BinarySearch;
import com.subha.examples.KeyNotFound;
import com.subha.examples.NotAValidInput;

public class BinarySearchApp {
     
    public static void main(String[] args){
      
        	
        	try {
        		System.out.println("Key "+args[0]+" found at index: "+ BinarySearch.findKey(args[0]));
        	} catch (NotAValidInput e) {
    			System.out.println("Hey! Please enter only integer");
    		} catch (KeyNotFound e) {
                System.out.println("Sorry but the integer you are looking for is not in the Array");
    		}
        }
    }
         
    	
    	