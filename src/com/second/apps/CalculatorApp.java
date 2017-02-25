package com.second.apps;

import com.subha.operators.Calculator;

public class CalculatorApp {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		int a = 5;
		int b = 3;
		
		int c = calculator.add(a, b);
		System.out.println("The addition of "+a+" and "+b+" is "+c);
		
		double x= 1.0;
		double y = 3.1;
		double z = calculator.add(x, y);
		System.out.println("The addition of "+x+" and "+y+" is "+z);
	}

}
