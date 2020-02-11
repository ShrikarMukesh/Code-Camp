package com.exmp;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string.");
		String str = scan.nextLine();
		String temp="";
		for(int i=str.length()-1;i>=0;i--)
		{
			temp=temp+str.charAt(i);
			
		}
         if(temp.equals(str)==true)
         {
        	 System.out.println("string is palindrome.");
         }
         else
         {
        	 System.out.println("string is not palindrome.");
         }
         scan.close();
	}

}
