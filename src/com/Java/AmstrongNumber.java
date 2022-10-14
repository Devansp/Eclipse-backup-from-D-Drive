package com.Java;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		int a=153;
		int sum=0, rem=1;
		
		while(a>0) {
		rem=a%10;	
		sum	=(rem*rem*rem)+sum;
		a=a/10;	
			
		}
		System.out.println(sum);
		
	}

}
