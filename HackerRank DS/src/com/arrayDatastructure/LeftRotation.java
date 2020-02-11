package com.arrayDatastructure;

import java.util.Scanner;

public class LeftRotation {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("How many elements?");
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			int aItem = scanner.nextInt();
			a[i] = aItem;
		}
		System.out.println("rotations u want?");
		int d = scanner.nextInt();
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[(i + n - d) % n] = a [i];
		}

		System.out.println("After rotation");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i]+" ");   
		}
	}
}