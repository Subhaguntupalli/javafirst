package com.subha.examples;

public class MonthFinder {

	public String findMonth(String monthNumber) throws NotAValidInput, NotAValidMonthNumber {
		String monthName = null;

		try {
			int month = Integer.parseInt(monthNumber);
			
			if(month<1 || month>12)
				throw new NotAValidMonthNumber();

			switch (month) {
			case 1:
//				System.out.println("January");
				monthName = "January";
				break;
			case 2:
				System.out.println("February");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("June");
				break;
			case 7:
				System.out.println("July");
				break;
			case 8:
				System.out.println("August");
				break;
			case 9:
				System.out.println("September");
				break;
			case 10:
				System.out.println("October");
				break;
			case 11:
				System.out.println("November");
				break;
			case 12:
				System.out.println("December");
				break;
			}
		} catch (NumberFormatException exp) {
			throw new NotAValidInput();
		}

		return monthName;

	}
}
