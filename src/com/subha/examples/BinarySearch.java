package com.subha.examples;



public class BinarySearch{
private static int[] searchedArray= {23,45,21,55,234,1,34,90};
	
	public static int findKey(String key) throws NotAValidInput, KeyNotFound {

		int searchedValue=0;
		int indexOfKey=-1;
		
		try{
			searchedValue = Integer.parseInt(key);
		}catch(NumberFormatException e){
			throw new NotAValidInput();
		}
		 int startIndex = 0;
		  int endIndex = searchedArray.length - 1;
		  int midindex = (startIndex + endIndex) / 2;
		  int midElement = searchedArray[midindex];
		  int foundIndex = 0;

		  while (startIndex <= endIndex) {
		   if (midElement < searchedValue) {
		    startIndex = midindex + 1;
		    midindex = (startIndex + endIndex) / 2;
		    midElement = searchedArray[midindex];
		   } else if (midElement > searchedValue) {
		    endIndex = midindex - 1;
		    midindex = (startIndex + endIndex) / 2;
		    midElement = searchedArray[midindex];
		   } else {
		    foundIndex = midindex;
		    break;
		   }
		
		if(indexOfKey==-1)
			throw new KeyNotFound();
		return indexOfKey;
	}
		return foundIndex;

}
}


	