package com.subha.apps;

public class PyramidNumbers1 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
            for (int j =0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.print("\n");
        }
		   

	}

}
