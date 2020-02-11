package com.patterns;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		System.out.println("enter the number of rows");
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n/2&&i!=0||i==0&&(j>0&&j<n/2)||i==n/2)	
					System.out.print("*");
			}
			System.out.println();
		}
        scan.close();
	}

}

