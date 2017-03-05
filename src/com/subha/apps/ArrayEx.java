package com.subha.apps;

public class ArrayEx {

	public static void main(String[] args) {
		
		String [] stringArray = new String[3];
		stringArray[0] = "welcome";
		stringArray[1] = "khammam";
		stringArray[2] = "hello";
		
		int [] intArray = { 1,2,3};
		
		String [] anotherStringArray = {"welcome", "khammam", "hello"};
		
		for (int i = 0; i < anotherStringArray.length; i++) {
		   System.out.println("value of the string at index "+i+" is:"+anotherStringArray[i]);
			
		}
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
	}

}
