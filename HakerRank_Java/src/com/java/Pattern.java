package com.java;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int N = scanner.nextInt();
		int flag = 1;
		for(int i = 0;i<=N;i++) {
            
			for(int j =0; j<N ;j++) {

				if(i==0) {
					System.out.print(N);
				}
				else if(j==N/2) {
					System.out.print(flag);
					flag++;
				}
				else {
					System.out.print(N);
				}


			}
			System.out.println();
		}
		scanner.close();

	}
}
