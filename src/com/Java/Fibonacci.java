package com.Java;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Logic 0    1    1    2    3    5    8    13 
//			  a    b  =c
//			  	   a    b  =c 
//			  	   		a    b	  =c
//	
	int a =0, b=1,c =1;
	for ( int i = 1; i <=5; i++) {
		c=a+b;
		a=b;
		b=c;
		System.out.print(c);
	}
		
		
		
	}

}
