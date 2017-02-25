package com.subha.apps;

import com.subha.calc.Calculator;

public class CalculatorApp  {

	public static void main(String[] args) {
	
		Calculator calculator=new Calculator();
		
 int a=5;
 int b=3;
	int c = calculator.add(a,b);
	System.out.println("The addition of "+a+" and "+b+" is: " +c);
	
	int d = calculator.sub(a,b);
	System.out.println("The Subtraction of "+a+" and "+b+" is: " +d);
	
int e = calculator.mul(a,b);
System.out.println("The multiplication of "+a+" and "+b+" is: " +e);

int f = calculator.div(a,b);
System.out.println("The division of "+a+" and "+b+" is: " +f);

int g = calculator.mod(a,b);
System.out.println("The reminder of "+a+" and "+b+" is: " +g);
	 
}
}
