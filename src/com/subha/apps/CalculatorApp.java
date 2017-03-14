package com.subha.apps;

import com.subha.operators.Calculator;

public class CalculatorApp {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		int a = 5;
		int b = 3;
		
		int c = calculator.add(a, b);
		System.out.println("The addition of "+a+" and "+b+" is "+c);
		int d = calculator.sub(a, b);
		System.out.println("The substraction of "+a+" and "+b+" is "+d);
		int e = calculator.mul(a, b);
		System.out.println("The multiplication of "+a+" and "+b+" is "+e);
		int f = calculator.div(a, b);
		System.out.println("The division of "+a+" and "+b+" is "+f);
		int g = calculator.mod(a, b);
		System.out.println("The modulus of "+a+" and "+b+" is "+g);
		
		
		double u = calculator.add(7.77, 6.66);
		System.out.println("The addition of 7.77 and 6.66 is "+c);
		double v = calculator.sub(7.77, 6.66);
		System.out.println("The reminder of 7.77 and 6.66 is "+v);
		double w = calculator.mul(7.77, 6.66);
		System.out.println("The multiplication of 7.77 and 6.66 is "+w);
		double z = calculator.div(7.77, 6.66);
		System.out.println("The division of 7.77 and 6.66is "+z);
		double h = calculator.mod(7.77, 6.66);
		System.out.println("The reminder of 7.77 and 6.66is "+h);
		
	}

}
