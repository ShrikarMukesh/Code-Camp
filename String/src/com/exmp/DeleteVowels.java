package com.exmp;

import java.util.Scanner;

public class DeleteVowels {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a String : ");
		String strOrig = scan.nextLine();
		System.out.println("enter the word to be deleted from the string.");
		String word= scan.nextLine();
		
         strOrig=strOrig.replaceAll(word,"");
         System.out.println("now the string becomes..");
         System.out.println(strOrig);
         scan.close();
	}

}
