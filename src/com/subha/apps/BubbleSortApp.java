package com.subha.apps;

import com.subha.examples.BSort;
import com.subha.examples.NotAValidInput;

public class BubbleSortApp {
     
    public static void main(String[] args){
         
    	try{
	          
        	
		      BSort.BubbleSort(args);
      	 
  } catch (NotAValidInput e) {
		System.out.println("Hey! Please enter only integer");
	}
    }


}
