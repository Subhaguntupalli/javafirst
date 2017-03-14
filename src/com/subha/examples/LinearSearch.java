package com.subha.examples;

public class LinearSearch {

	private static int[] searchedArray= {23,45,21,55,234,1,34,90};
	
	public static int findKey(String key) throws NotAValidInput, KeyNotFound {

		int searchedValue=0;
		int indexOfKey=-1;
		
		try{
			searchedValue = Integer.parseInt(key);
		}catch(NumberFormatException e){
			throw new NotAValidInput();
		}
		
		for (int i = 0; i < searchedArray.length; i++) {
			if (searchedArray[i] == searchedValue) {
				indexOfKey=i;
				break;
			}
		}
		if(indexOfKey==-1)
			throw new KeyNotFound();
		return indexOfKey;
	}

}
