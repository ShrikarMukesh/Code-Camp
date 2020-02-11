package com.exmp;

import java.util.Scanner;

public class ElementDeletion {
	public static void main(String args[]) {
		int count = 0;
		int arr[] = new int[4];
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Array Size : ");
		int size = scan.nextInt();

		System.out.print("Enter Array Elements : ");
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.print("Enter Element to be Delete : ");
		int del = scan.nextInt();
		for (int i = 0; i < size; i++) {
			if (arr[i] == del) {
				
				for (int j = i; j < (size - 1); j++) {
					arr[j] = arr[j + 1];
				}
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.print("Element Not Found..!!");
		} else {
			System.out.print("Element Deleted Successfully..!!");
			System.out.print("\nNow the New Array is :\n");
			for (int i = 0; i < (size - 1); i++) {
				System.out.print(arr[i] + " ");
			}
		}
		scan.close();
	}
}