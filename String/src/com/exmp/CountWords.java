package com.exmp;

import java.util.Scanner;

public class CountWords {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Sentence : ");
		String sentence = scan.nextLine();
		int n = countWords(sentence);
		System.out.print("Total Number of Words in Entered Sentence is " + n);
		scan.close();
	}


	public static int countWords(String str) {
		int count = 1;
		int n = str.length();
		for (int i = 0; i <= n-1; i++) {
			char ch = str.charAt(i);
			if (ch == ' ' && (ch+1)!= ' ') {
				count++;
			}
		}
		return count;
	}


}
