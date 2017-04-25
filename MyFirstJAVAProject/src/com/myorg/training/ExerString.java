package com.myorg.training;

public class ExerString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1 .  Printing String in reverse
		String s = args[0];
		for(int i = s.length()-1; i>=0; i--){
			System.out.print(s.charAt(i));
		}
	
// Printing line in reverse	
	String statment = "How are you";
	String splitchar = "";
	String[] tokens = statment.split(splitchar);
	System.out.println("");
	for(int j = tokens.length -1; j>=0; j--){
		System.out.print(tokens[j] + splitchar);
	}
	System.out.println("");
//fibanocci sceries
	int Current = 1, prev =0, fibanocci = 0;
	
	while(Current <= 100){
		System.out.print(Current + " ");
		fibanocci = Current;
		Current += prev;
		prev = fibanocci;
	}
	
	}

}
