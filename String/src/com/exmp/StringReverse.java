package com.exmp;

import java.util.Scanner;

public class StringReverse {
	public static void main(String args[]) {
		String rev = "";
	
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a String to Reverse : ");
		 String orig = scan.nextLine();

		 int len = orig.length();

		for (int i = len - 1; i >= 0; i--) 
		{
			rev = rev + orig.charAt(i);
		}

		System.out.print("Reverse of Entered String is : " + rev);
        scan.close();
	}
}