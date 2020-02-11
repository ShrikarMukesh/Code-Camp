package com.exmp;

import java.util.Scanner;

public class StringSorting {
	static String temp;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of string.");
		int n = sc.nextInt();
		String[] arr=new String[n];
		System.out.println("enter few names");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextLine();
		}
		System.out.println("sorting started");
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(arr[j-1].compareTo(arr[j])>0)
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("new array is:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");

		}
		sc.close();
	}

}
