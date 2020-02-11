package com.exmp;

import java.util.Scanner;
public class SelectionSort {

	public static void main(String[] args) {
		int temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("how many elements you want to enter?");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the  elements");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("sorting has started..");
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("sorting is successful");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		scan.close();
	}
}
