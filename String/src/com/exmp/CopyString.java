package com.exmp;

import java.util.Scanner;

public class CopyString {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String strOrig = scan.nextLine();
		System.out.print("Copying String...\n");
		StringBuffer strCopy = new StringBuffer(strOrig);

		System.out.print("String Copied Successfully..!!\n");
		System.out.print("The Copied String is " + strCopy);
		scan.close();
	}
}
