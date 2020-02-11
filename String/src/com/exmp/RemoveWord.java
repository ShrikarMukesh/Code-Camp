package com.exmp;

import java.util.Scanner;

public class RemoveWord {
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String  str = scan.nextLine();

		System.out.print("Enter the word to be deleted : ");
		String  word = scan.nextLine();

		String r =str.replaceAll(word,"");
		System.out.print("word Removed from the Entered String Successfully..!!\nNow the String is :\n");
		System.out.print(r);
		scan.close();
	}
}
