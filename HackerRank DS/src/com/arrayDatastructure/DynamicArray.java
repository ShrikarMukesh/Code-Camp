package com.arrayDatastructure;

import java.util.Scanner;

public class DynamicArray {
	static   int[]increaseSizeOfArray(int []arr){
		
		int []brr = new int[(arr.length*2)];
		for (int i = 0; i < arr.length; i++) {
			brr[i] = arr[i];     
		}
		return brr;
	}
	public static void main(String[] args) {
		
		int []arr=new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the elements into the array");
		for (int i = 0; i < 11; i++) {
			if (i<arr.length) {
				arr[i]= scanner.nextInt();
			}
			else {
				arr=increaseSizeOfArray(arr);
				arr[i]= scanner.nextInt();
			}        
		}
        scanner.close();
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr="+arr[i]);
		}   
		
	}
}