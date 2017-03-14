package com.subha.apps;
import com.subha.examples.NotAValidInput;
import com.subha.examples.SplitURL;

public class SplitURLApp {

	public static void main(String[] args) {
		
		SplitURL urlSplit = new SplitURL();
		
		try {
			String [] urlSplits = urlSplit.splitURL(args[0]);
			
			if(urlSplits.length==3){
				System.out.println("Protocol: "+urlSplits[0]);
				System.out.println("DNSNAME: "+urlSplits[1]);
				System.out.println("Path: "+urlSplits[2]);
				
			}else if(urlSplits.length==4){
				System.out.println("Protocol: "+urlSplits[0]);
				System.out.println("IPAddress: "+urlSplits[1]);
				System.out.println("PortNo: "+urlSplits[2]);
				System.out.println("Path: "+urlSplits[3]);
				
			}else{
				System.out.println("URL split gave wrong output");
			}
			
		} catch (NotAValidInput e) {
			System.out.println("Please enter a valid uRL format string");
		} catch (Exception e) {
			System.out.println("Something bad happened");
		}
	}
}