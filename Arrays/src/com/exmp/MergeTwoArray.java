package com.exmp;

import java.util.Scanner;

public class MergeTwoArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of first array");
		int m = scan.nextInt();
		int arr1[]=new int[m];
		System.out.println("enter the elements of first array");
		for(int i=0;i<m;i++){
			
			arr1[i]=scan.nextInt();
		}
		System.out.println("enter the size of second array");
		int n = scan.nextInt();
		int arr2[]=new int[n];
		System.out.println("enter the elements of second array");
		for(int j=0;j<n;j++){
			arr2[j]=scan.nextInt();
		}
		int merge[]=new int[m+n];
		int count=0;

		System.out.println("merging started");
		for(int i=0;i<m;i++) {
			
			merge[i]=arr1[i];
			count++;
		}
		for(int j=0;j<n;j++) {
			
			merge[count++]=arr2[j];
		}

		System.out.println("merged array is:");
		for(int i=0;i<merge.length;i++){
			
			System.out.print(merge[i]+" ");
		}

		System.out.println();
        scan.close();
	}

}
