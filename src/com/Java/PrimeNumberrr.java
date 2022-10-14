package com.Java;

public class PrimeNumberrr {
	
	public static void main(String[] args) {

		
/*		
 * 
 it is correct...
 	
 	int	n=8;
			int count=0;
			for (int i = 2; i <n; i++) {

			if(n%i==0) {
				count++;
				}
		}
	if(count==0) {
		System.out.println("Number is prime:"+n);
		
	}else {
		System.out.println("Number is not prime");
	}

*/
		int n;
		int totalprime = 0;
	    int notprime = 0;
		for (n = 1; n <100; n++) {    // 1 is not prime number 
			int count=0;

			for (int j = 2; j <n ; j++) {
				if(n%j==0) {
					count++;
				}
				
			}
		if(count==0) {
				System.out.println("number is Prime: "+ n);
				totalprime++;
				
			}
		else {
			//			System.out.println("it is not prime: "+ n);
			notprime++;
			} 

	}
System.out.println("Total count of prime numbers: "+ totalprime);
System.out.println("Total count of non prime: "+ notprime);	
	}
}
