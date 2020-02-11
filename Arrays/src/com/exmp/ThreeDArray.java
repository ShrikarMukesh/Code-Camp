package com.exmp;

import java.util.Scanner;

public class ThreeDArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("emter the number of blocks,rows and columns.");
		int m = scan.nextInt();
		int n = scan.nextInt();
		int o = scan.nextInt();
		int arr[][][]=new int[m][n][o];
		for(int i=0;i<m;i++){	
			for(int j=0;j<n;j++){
				
				for(int k=0;k<o;k++){
					
					System.out.println("enter the marks of school"+i+"classroom"+j+"student"+k);
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		System.out.println("the marks are:");
		for(int i=0;i<m;i++){
			
			for(int j=0;j<n;j++){
				
				for(int k=0;k<o;k++){
					
					System.out.print(arr[i][j][k]+" ");

				}
				System.out.println();
			}
			System.out.println();
		}
		scan.close();
	}
}
