package com.myorg.training;

public class ExOperators {
 public static void main (String[] args){
// Unary Operators (1. Postfix: exp++, exp-- 2. Prefix: ++exp,--exp, +exp,-exp,~,!)
	int a =10, b=20;
	System.out.println("Unary Operator Example:  " + a++ + ++b);
	// now a = 11 and b= 21
	System.out.print("Unary operator Postfix Example:  ");
	System.out.println(a++);	
	//now a = 12
	System.out.print("Unary Operator Prefix Example:   ");
	System.out.println(b++);
	//now b = 22
	System.out.print("Unary Operators Combination of Prefix and Postfix:  ");
	System.out.println(b++ + ++a);
	//now b = 23 and a = 13
	System.out.println(+a);
	System.out.println(+a);
	System.out.println(-a);
	System.out.println(-a);
	System.out.println(a);
	System.out.println(~a);
	System.out.println(++a);
	System.out.println(~a);
	boolean c = true;
	boolean d = false;
	System.out.println(!c);
	System.out.println(!d);
	
//Arithmatic Operators	(+, -, *, / and %)
	System.out.println(a +"  "+b);
	int x= 50, y= 7, e= 5;
	System.out.println(a/y+x-y*e);
	
}
}
