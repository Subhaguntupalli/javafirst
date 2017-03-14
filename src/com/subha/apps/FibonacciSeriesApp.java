package com.subha.apps;

import com.subha.examples.FiboSeries;
import com.subha.examples.NotAValidInput;

public class FibonacciSeriesApp {

	public static void main(String[] args) {
		try {
			FiboSeries.fibonaccci(args[0]);
		} catch (NotAValidInput e) {
			System.out.println("Hey! Please enter only integer");
		}
	}
}