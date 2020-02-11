package com.exmp;

import java.util.Scanner;

public class CharacterCountt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String str = sc.nextLine();
	     countChar(str);
	     sc.close();
  
	}
	
	public static void countChar(String str) {
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			String temp="";
			while(i<ch.length && ch[i]!=' ')
			{
				temp+=ch[i];
				i++;
			}
			
		if(temp.length()>0)
		{
			System.out.println(temp+"->"+temp.length());
		}
			
			
		}
		
	}


}
