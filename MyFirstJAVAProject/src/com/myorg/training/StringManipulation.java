package com.myorg.training;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Comparing two Strings
		String S1 = "Hello";
		String S2 = "Hello";
		String S3 = "hello";
		

		if (S1 == S2) {

			System.out.println("Equal");
		}
		if (S1.equalsIgnoreCase(S3) ) {
			System.out.println("Equal");
		}
		if (S1.equals(S3) ) {
			System.out.println("Equal");
		}
		
	// Finding Word in sentence
		String S4 = "How are you?";
		if(S4.indexOf("You") != -1){
			System.out.println("Found");
		}
			else{
				System.out.println("Not Found");
			}
	 System.out.println(S4.toUpperCase());
	 	 
	}
	//
}
