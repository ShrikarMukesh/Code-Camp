package com.exmp;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		int a=0,b=1;
		int sum;

		for(int i=1;i<=num;i++)
		{
			System.out.print(a+" ");
			sum=a+b;
			a=b;
			b=sum;
		}
		scan.close();

	}

}
