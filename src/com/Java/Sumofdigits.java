package com.Java;

public class Sumofdigits {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =12345;
		int rem,sum=0;

while (a>0) {
	

	rem=a%10; // Extracting last digit i.e remainder
	sum=sum+rem;
	a=a/10; 
}
System.out.println(sum);		
		
	}

}

//a=a/10;
//count=count+1;
