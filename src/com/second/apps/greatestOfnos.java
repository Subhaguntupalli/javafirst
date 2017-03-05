package com.second.apps;


public class greatestOfnos {

	public static void main(String[] args) {
		
		      int x=14, y =14, z=14;
		      
		 
		      if ( x > y && x > z )
		         System.out.println("First number is largest.");
		      else if ( y > x && y > z )
		         System.out.println("Second number is largest.");
		      else if ( z > x && z > y )
		         System.out.println("Third number is largest.");
		      else   
		         System.out.println("numbers are not distinct.");
		  
	}
}