package com.exmp;

import java.util.Scanner;

public class ToLowerCase {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string in Uppercase : ");
		String str= scan.next();
		for(int i=0;i<str.length();i++)
		{
			int ch=str.charAt(i);
			if(ch>64&&ch<91)
			{
				ch=ch+32;
				System.out.print((char)ch);
			}
			else if(ch>96&&ch<123)
			{
				ch=ch-32;
				System.out.print((char)ch);
			}
			if(ch==32)
			{
				System.out.print(" ");
			}
		}

		System.out.println();
		scan.close();
	}
}


