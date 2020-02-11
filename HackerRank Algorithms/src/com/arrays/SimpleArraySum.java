package com.arrays;

import java.util.*;

public class SimpleArraySum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many elements?");
		int n = scanner.nextInt();
		int a[] = new int[n];
		System.out.println("Ok insert");
		for(int i =0;i<a.length;i++) {
			a[i] = scanner.nextInt();
		}	
		int sum = simpleArraySum(a);
		System.out.println(sum);
		scanner.close();
	}
	static int simpleArraySum(int[] ar) {
		
		int sum = 0;
        for(int i =0;i<ar.length;i++) {
        	sum = sum + ar[i];
        }
		return sum;
	}
}
