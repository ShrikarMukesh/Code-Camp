package com.java2;

import java.util.Scanner;

public class JavaExceptionHandling {
	static long power(int n, int p) throws Exception {
		if (n < 0 || p < 0) {
			throw new Exception("n or p should not be negative.");
		} else if (n == 0 && p == 0) {
			throw new Exception("n and p should not be zero.");
		} else {
			return (long) Math.pow(n, p);
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in .hasNextInt()) {
			int n = in .nextInt();
			int p = in .nextInt();
			
			try {
				System.out.println(power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		in.close();
	}
}
