package com.exmp;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String args[]) {
		String  strWithoutSpace;
		int i;
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Sentence : ");
		String str = scan.nextLine();

		// 1. Using replaceAll() Method

		strWithoutSpace = str.replaceAll(" ", "");

		System.out.println(strWithoutSpace);

		// 2. Without Using replaceAll() Method

		char[] strArray = str.toCharArray();

		StringBuffer sb = new StringBuffer();

		for (i = 0; i < strArray.length; i++) {
			if ((strArray[i] != ' ') && (strArray[i] != '\t')) {
				sb.append(strArray[i]);
			}
		}

		System.out.println(sb);
		scan.close();
	}

}
