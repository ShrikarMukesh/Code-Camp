package com.exmp;

import java.util.Scanner;

public class SwapString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first String");
		String str1 = scan.nextLine();
	
		System.out.print("Enter the second String : ");
		String str2 = scan.nextLine();
		
		String temp="";
		 
		System.out.println("strings before swapping:");
		System.out.println("string1"+" "+str1);
		System.out.println("string2"+" "+str2);
		
		temp=str1;
		str1=str2;
		str2=temp;
				
 
		System.out.println("strings after swapping:");
		System.out.println("string1"+" "+str1);
		System.out.println("string2"+" "+str2);
		scan.close();
	}

}
