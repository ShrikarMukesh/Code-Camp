package com.exmp;

import java.util.Scanner;

public class RemoveVowel {
	public static void main(String args[])
	   {
	      Scanner scan = new Scanner(System.in);
	       System.out.print("Enter a String : ");
	       String str = scan.nextLine();
	       String r=removeVowels(str);
	       System.out.println(r);
	       scan.close();
       }
	private static String removeVowels(String s) {
		String finalstring = "";
		for(int i=0;i<s.length();i++)
		{
			if(!isVowel(Character.toLowerCase(s.charAt(i))))
			{
				finalstring=finalstring+s.charAt(i);
			}
		}
		
		return finalstring;
	}
	private static boolean isVowel(char ch) {
		String vowels="aeiouAEIOU";
		for(int i=0;i<10;i++)
		{
			if(ch==vowels.charAt(i))
			{
				return true;
			}
		
		}
		
	return false;
	}


}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

