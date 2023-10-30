package com.careerit.cj.day1;

public class SwapTwoNumbers{

	public static void main(String[] args){
	
		int a = 10;
		int b = 20;
		System.out.println("Before swap a = "+a+" b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
		System.out.println("After swap  a = "+a+" b = " + b);
	
	}

}
