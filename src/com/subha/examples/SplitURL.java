package com.subha.examples;

public class SplitURL {
	
   public String [] splitURL(String urlString) throws NotAValidInput{
	   
	   String [] splits=null;
	   String [] splitOne = urlString.split("/");
	   //   escape character
	   
	   System.out.println("total splits: "+splitOne.length);

	   if(splitOne.length!=4)
		   throw new NotAValidInput();
	   
	   String [] splitTwo = splitOne[2].split(":");
	   
	   if(splitTwo.length==1){
		   splits = new String[3];
		   splits[0] = splitOne[0];
		   splits[1] = splitOne[2];
		   splits[2] = splitOne[3];
	   }else if(splitTwo.length==2){
		   splits = new String[4];
		   splits[0] = splitOne[0];
		   splits[1] = splitOne[2];
		   splits[2] = splitOne[3];
		   splits[3] = splitOne[4];
	   }
	   
	   return splits;
   }
   
}
