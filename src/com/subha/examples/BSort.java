package com.subha.examples;



public class BSort{
	 public static void BubbleSort(String [] arr) throws NotAValidInput{
	    	
    	 for(int i = 0; i < arr.length; i++) {
             
    		 int[] nums = new int[arr.length];
		nums[i] = Integer.parseInt(arr[i]); 
       
      
	

	    int n, c, d, swap;
	    n=arr.length;
	 
	    for (c = 0; c < ( n - 1 ); c++) {
	      for (d = 0; d < n - c - 1; d++) {
	        if (nums[d] > nums[d+1]) 
	        {
	          swap       = nums[d];
	          nums[d]   = nums[d+1];
	          nums[d+1] = swap;
	        }
	      }
	    }
	 
	    System.out.println("Sorted list of numbers");
	 
	    for (c = 0; c < n; c++) 
	      System.out.println(nums[c]);
	  }
	}
}