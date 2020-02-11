package com.exmp;

import java.util.Scanner;

public class Charactercount {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a String : ");
		String str = scan.nextLine();
		int n = str.length();
		for (char c = 'A'; c <= 'z'; c++) {
			int count = 0;
			for (int i = 0; i < n; i++) {
				char [] ch = str.toCharArray();
				if (ch[i] == c) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println("The character " + c + " has occurred for " + count + " times");
			}
		}
        scan.close();
	}
}
