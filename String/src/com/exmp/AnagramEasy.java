package com.exmp;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramEasy {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the first String");
		String str1 = scan.nextLine();

		System.out.println("enter the second String");
		String str2 = scan.nextLine();

		str1=str1.replaceAll(" ", "");
		str2=str2.replaceAll(" ", "");

		str1=str1.toLowerCase();
		str2=str2.toLowerCase();

		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
		scan.close();
	}

}
