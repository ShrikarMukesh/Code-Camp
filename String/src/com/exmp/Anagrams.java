package com.exmp;

import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first String");
		String str1 = scan.nextLine();

		System.out.print("Enter the second String : ");
		String str2 = scan.nextLine();

		int len1 = str1.length();
		int len2 = str1.length();
		int not_found = 0;
		if (len1 == len2) {
			int len = len1;
			for (int i = 0; i < len; i++) {
				int found = 0;

				for (int j = 0; j < len; j++) {
					if (str1.charAt(i) == str2.charAt(j)) {
						found++;
						break;
					}
				}
				if (found == 0) {
					not_found = 1;
					break;
				}

			}

			if (not_found == 1) {
				System.out.println("Strings are not anagrams");
			} else {
				System.out.println("Strings are anagrams");
			}
		}
		else
		{
			System.out.println("Strings are not anagrams fsffdfd");
		}
        scan.close();
	}


}
