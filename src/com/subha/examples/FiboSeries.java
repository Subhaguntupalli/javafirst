package com.subha.examples;

public class FiboSeries{
	
    public static void fibonaccci(String number) throws NotAValidInput{
    	int count=0;
    	try{
         count = Integer.parseInt(number);
    	}catch(NumberFormatException e){
    		throw new NotAValidInput();
    	}
         
    	int n1=0,n2=1,n3,i;    
	    System.out.print(n1+" "+n2);
	       
	    for(i=2;i<count;++i)  
	    {    
	     n3=n1+n2;    
	     System.out.print(" "+n3);    
	     n1=n2;    
	     n2=n3;    
	    } 
    }
}