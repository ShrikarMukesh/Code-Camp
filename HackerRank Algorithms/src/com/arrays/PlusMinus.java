package com.arrays;

import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many elements?");
		int n = scanner.nextInt();
		int a[] = new int[n];
		System.out.println("Ok insert");
		for(int i =0;i<a.length;i++) {
			a[i] = scanner.nextInt();
		}
		plusMinus(a);
		scanner.close();
	}
	static void plusMinus(int[] a) {
		
		int n = a.length;
		//System.out.println(divider);
		double positive = 0,negative =0,zeros = 0;
		for(int i =0;i<a.length;i++) {
			if(a[i] == 0) {
				zeros++;
			}else if(a[i] <0) {
				negative++;			
			}else {
				positive++;
			}
		}
		System.out.println(positive+" "+negative+" "+zeros);
		System.out.printf("%.6f %n",positive/n);
		System.out.printf("%.6f %n",negative/n);
		System.out.printf("%.6f %n",zeros/n);
	}
}
