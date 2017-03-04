package com.subha.apps;

public class IntWrapper {

	public static void main(String args[]){ 
		
			int x = 345;  
			Integer y = new Integer(x);
			String s = Integer.toString(y);
			System.out.println(s);
		
		    Integer i1 = new Integer (25);  
            Integer i2 = new Integer ("25");  
            Integer i3= new Integer (35);  
            System.out.println("Comparing using compareTo Obj1 and Obj2: " + i1.compareTo(i2));  
            System.out.println("Comparing using compareTo Obj1 and Obj3: " + i1.compareTo(i3));   
            System.out.println("Comparing using equals Obj1 and Obj2: " + i1.equals(i2));  
            System.out.println("Comparing using equals Obj1 and Obj3: " + i1.equals(i3));  
            Float f1 = new Float("2.25");  
            Float f2 = new Float("20.43");  
            Float f3 = new Float(2.25);  
            System.out.println("Comparing using compare f1 and f2: " +Float.compare(f1,f2));  
            System.out.println("Comparing using compare f1 and f3: " +Float.compare(f1,f3));   
            Float f = i1.floatValue() + f1;  
            System.out.println("Addition of intObj1 and f1: "+ i1 +"+" +f1+"=" +f );  
 }
}
