package com.subha.apps;

public class StringMethods {
	 
		public static void main(String args[]){ 
		
		String name="subha";  
		char character=name.charAt(4); 
		System.out.println(character);  
		
		String s1="hello";  
		String s2="hello";  
		String s3="Hello";  
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		 
		String s4="How ";  
		s4 = s4.concat("are you?");  
		System.out.println(s4);  
		
		String s5="INDIA";  
		String s6="india";  
		String s7="India";    
		System.out.println(s5.equals(s6)); 
		System.out.println(s5.equals(s7)); 
		
		String s8="kHAMMAM";  
		String s9="Khammam";  
		String s10="khammam";    
		System.out.println(s8.equalsIgnoreCase(s9));
		System.out.println(s8.equalsIgnoreCase(s10));
		
		String s11="";  
		String s12="non empty";   
		System.out.println(s11.isEmpty());  
		System.out.println(s12.isEmpty());  
		
		String joinString=String.join(" ","joing","two","and","more strings");  
		System.out.println(joinString); 
		
		String s13="helloWorld";  
		String s14="Welcome";  
		System.out.println("string length is: "+s13.length());
		System.out.println("string length is: "+s14.length());
		
		String s15="Java Basics before Selenium. There are many topics in java";  
		String replaceString1=s15.replace('a','e');
		System.out.println(replaceString1);  
		 
		String replaceString2=s15.replaceAll("Java","Selenium");
		System.out.println(replaceString2);  
		
		System.out.println(s15.startsWith("ja"));  
		System.out.println(s15.startsWith("Java"));  
		
		System.out.println(s1.substring(2,4)); 
		System.out.println(s1.substring(2));
		
		String lower=s15.toLowerCase();  
		System.out.println(lower);  
		
		String upper=s15.toUpperCase();  
		System.out.println(upper); 
		
		int value=30;  
		String s16=String.valueOf(value);  
		System.out.println(s16+10);
		} 
	
}

