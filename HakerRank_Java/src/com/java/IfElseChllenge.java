package com.java;

import java.util.Scanner;

public class IfElseChllenge {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int N = scanner.nextInt();
		if(N <= 100) {

			if(N >= 2 && N <= 5 ) {

				if(N % 2 == 0) {
					System.out.println("Not Weird");
				}
				else {
					System.out.println("Weird");
				}
			}
			else if(N>5 && N<=20 && N %2 == 0) {

				System.out.println("Weird");

			}else if ( N>20 && N<=100 && N % 2 == 0) {

				System.out.println("Not Weird");

			}else {

				if(N % 2 != 0) {
					System.out.println("Weird");
				}
			}
		}

		scanner.close();
	}
}
