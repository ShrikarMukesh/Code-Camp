package com.arrays;

import java.util.Scanner;

public class BirthdayCakeCandles {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many elements?");
		int n = scanner.nextInt();
		int a[] = new int[n];
		System.out.println("Ok insert");
		for(int i =0;i<a.length;i++) {
			a[i] = scanner.nextInt();
		}
		int result = birthdayCakeCandles(a);
		System.out.println(result);
		scanner.close();
	}
	static int birthdayCakeCandles(int[] a) {
		int theElement = a[0];
		for(int i =0;i<a.length-1;i++) {
			if(a[i] >= theElement) {
				theElement = a[i];
			}
		}
		int flag = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i] == theElement) {
				flag++;
			}
		}
		return flag;
    }
}
