package com.subha.examples;


public class DistinctNumbers {
	 
    public static void printDistinctElements(String [] arr) throws NotAValidInput{
    	
    	 for(int i = 0; i < arr.length; i++) {
             
    		 int[] nums = new int[arr.length];
		nums[i] = Integer.parseInt(arr[i]); 
       
            boolean isDistinct = false;
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    isDistinct = true;
                    break;
                }
            }
            if(!isDistinct){
                System.out.print(arr[i]+" ");
            }
            
        }
    }
    
}

 
     
