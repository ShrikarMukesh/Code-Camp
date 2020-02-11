package com.arrayDatastructure;

import java.util.Scanner;

public class SparseArrays {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many?");
		int n = scanner.nextInt();
		String []sArr = new String[n];
		System.out.println("Enter strings");
		for(int i=0;i<n;i++) {
			sArr[i] = scanner.next();
		}
		System.out.println("Input strings");
		for(int i=0;i<n;i++) {
			System.out.print(sArr[i]+" ");
		}
		System.out.println();
		System.out.println("Number of quersies ?");
		int q = scanner.nextInt();
		String []queries = new String[q];
		System.out.println("Enter strings");
		for(int i=0;i<q;i++) {
			queries[i] = scanner.next();
		}
		System.out.println("Input queries");
		for(int i=0;i<q;i++) {
			System.out.print(queries[i]+" ");
		}
		
		/////
		int count;
		int fLenght = queries.length;
		int fArr[] = new int[fLenght];
		for(int i=0;i<queries.length;i++) {
			count = 0;
			String temp1 = queries[i];
			for(int j=0;j<sArr.length;j++) {
				String temp2 = sArr[j];
				
				if(temp1.equals(temp2)) {
					count++;
				}
				
			}
			fArr[i] = count;
		}
		System.out.println();
		for(int i = 0;i<fArr.length;i++) {
			System.out.println(fArr[i]);
		}
		scanner.close();

	}
}
