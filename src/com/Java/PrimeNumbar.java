package com.Java;

public class PrimeNumbar {

	public static void main(String[] args) {
		
		int n=8;
		int count = 0;
	
		for(int i = 2;i<n;i++) {  //checking for 2 to 7

			if(n%i==0) {
			count++;
			}
			
		}
		
		if(count==0) {
		System.out.println("The Number is Prime: "+n);
		}
		else{
			System.out.println("Not Prime");
		}
}
}