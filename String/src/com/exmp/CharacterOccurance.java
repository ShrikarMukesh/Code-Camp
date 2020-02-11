package com.exmp;

import java.util.Scanner;

public class CharacterOccurance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the String ");
		String str = scan.nextLine();
		for(char ch='a';ch<'z';ch++)
		{
			int count=0;
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)==ch)
				{
					count++;
				}
			}
			if(count!=0)
			{
				System.out.println(ch+"=" +count);
			}
		}
        scan.close();
	}

}
