package com.Java;

public class Prime_upto_particularNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=7;
		
		for(int i = 1;i<=n;i++) {
			int count =0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
				count++;
		}	
	}
			if(count==0) {
			System.out.println("prime "+i);
	
	
			}
		}
	}
}