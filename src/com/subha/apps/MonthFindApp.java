package com.subha.apps;

import com.subha.examples.MonthFinder;
import com.subha.examples.NotAValidInput;
import com.subha.examples.NotAValidMonthNumber;

/**
 * This is a monthFinder app. And it will take a integer and print the month name
 * corresponding to the integer.
 * 
 * @author RIDHI
 *
 */
public class MonthFindApp {

	public static void main(String[] args) {
		MonthFinder monthFinder = new MonthFinder();
		
		try {
			String monthName = monthFinder.findMonth(args[0]);
			System.out.println("The name of the month for your input is: "+monthName);
		} catch (NotAValidInput e) {
		   System.out.println("Hey! please give a number input");
		} catch (NotAValidMonthNumber e) {
			System.out.println("Hey! please give a number between 1 and 12");
		}
	}

}
