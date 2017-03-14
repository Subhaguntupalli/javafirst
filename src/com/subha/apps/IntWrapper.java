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
            
            String  s3[] = {"10", "20"};
            System.out.println("Sum before:"+ s3[0] + s3[1]); 
            int xx=Integer.parseInt(s3[0]); 
            int yy=Integer.parseInt(s3[1]); 
            int z=xx+yy;
            System.out.println("sum after: "+z);
            
            Integer intWrapper = Integer.valueOf("12345");
            
             Integer intWrapper2 = Integer.valueOf("11011", 2);
             Integer intWrapper3 = Integer.valueOf("D", 16); 
              System.out.println("Value of intWrapper2 Object: "+ intWrapper2);
            System.out.println("Value of intWrapper3 Object: "+ intWrapper3);
            System.out.println("Hex value of intWrapper: " + Integer.toHexString(intWrapper));
            System.out.println("Binary Value of intWrapper2: "+ Integer.toBinaryString(intWrapper2));
 }
}
