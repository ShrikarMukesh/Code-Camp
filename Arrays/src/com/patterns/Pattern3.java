package com.patterns;

public class Pattern3 {
	public static void main(String args[]) {
		int  k = 16,l=1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print(" ");
			}
			k = k-4;
			for (int j = 0; j <l; j++) {
				System.out.print("* ");
			}
			l=l+2;
			System.out.println();
		}
	}
	
       
       
}
