package com.arrays;

import java.util.Scanner;

public class AVeryBigSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many elements?");
		int n = scanner.nextInt();
		long a[] = new long[n];
		System.out.println("Ok insert");
		for(int i =0;i<a.length;i++) {
			a[i] = scanner.nextLong();
		}
		
		long result = aVeryBigSum(a);
		System.out.println(result);
		scanner.close();
	}
	static long aVeryBigSum(long[] a) {
		long sum =0;
		for(int i=0;i<a.length;i++) {
			sum = sum + a[i];
		}
		return sum;
	}
}
