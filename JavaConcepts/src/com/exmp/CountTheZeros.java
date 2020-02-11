package com.exmp;

import java.util.Scanner;
public class CountTheZeros {
	public static void main(String[] args)  {

		Scanner scan = new Scanner(System.in);
		int[][] array=null ;
		System.out.println("How many test cases");
		int n = scan.nextInt();		
		for(int i =0;i<n;i++) {
			System.out.println("number inputs to" + i +" "+"array");
			int size = scan.nextInt();
			for(int j=0;j<size;j++) {
				array = new int[i][size];
				array[i][j] = scan.nextInt();
			}			
		}

		for(int i =1;i<=n;i++) {
			System.out.println("number inputs to" + i +" "+"array");
			int size = scan.nextInt();
			array = new int[n][size];
			for(int j=0;j<array.length;j++) {
				array[i][j] = scan.nextInt();
			}
		}
		scan.close();
	}

}
