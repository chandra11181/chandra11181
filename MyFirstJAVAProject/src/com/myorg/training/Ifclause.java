package com.myorg.training;

public class Ifclause {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 1;
		switch(b++) {
		case 0: System.out.println("I am on 0");
		break;
		case 1: System.out.println("I am on 1");
		break;
		default: System.out.println("I am not in range");
		}
	}

}
