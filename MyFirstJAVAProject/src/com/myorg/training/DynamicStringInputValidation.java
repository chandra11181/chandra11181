package com.myorg.training;

public class DynamicStringInputValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean status =true;
		String userName = "";
		try {
		userName = args[0];
		userName = userName.trim();
		int a = userName.length();
		System.out.println(a);
		if(userName.length() <6 || userName.length() >6){
		status = false;
		
		}
		char firstChar = userName.charAt(0);
		try {
			int i = Integer.parseInt(firstChar +"");
			status = false;
		} catch(NumberFormatException e) {
			
		}
		
		char secondchar = userName.charAt(1);
		try {
			int i = Integer.parseInt(secondchar+"");
			status = false;
		}catch(NumberFormatException e){
			
		}
		for(int i=2;i<6;i++ ) {
			char numaricpart = userName.charAt(i);
			try {
				int i1 = Integer.parseInt(numaricpart+"");
				
			}catch(NumberFormatException e) {
				status = false;
			}
		}
		
		}catch(ArrayIndexOutOfBoundsException e) {
			status = false;
		}
		
		if (status) {
		System.out.println("Welcome  "+userName);	
		}else {
			System.out.println("Invalid User");
		}
		
		
	}

}
