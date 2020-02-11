package com.string.programs;

import java.util.Scanner;
class RemoveWhiteSpaces {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string to be cleaned from white spaces...!");
		String inputString = sc.nextLine();
		char[] charArray = inputString.toCharArray();
		
		System.out.println("First way...");
		String stringWithoutSpaces2 = inputString.replaceAll("\\s+", "");
		System.out.println("Input String Without Spaces : "+stringWithoutSpaces2);
		
		System.out.println();
		System.out.println("second way...");
		String stringWithoutSpaces = "";
		for (int i = 0; i < charArray.length; i++) {
			
			if ( (charArray[i] != ' ') && (charArray[i] != '\t') ){
				stringWithoutSpaces = stringWithoutSpaces + charArray[i];
			}
		}
		System.out.println("Input String : "+inputString);
		System.out.println("Input String Without Spaces : "+stringWithoutSpaces);
		sc.close();
	}
}