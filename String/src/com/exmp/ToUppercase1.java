package com.exmp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ToUppercase1 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the line");
		String str1=br.readLine();
		StringBuffer sb = new StringBuffer(str1.length());
		
		String[] words=str1.split(" ");
		for(int i=0;i<words.length;i++)
		{
			sb.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" ");
			
		}
	
		String s= new String(sb);
		String s1="";
		StringTokenizer stk = new StringTokenizer(s," ");
		while(stk.hasMoreTokens()==true)
		{
			s1=stk.nextToken()+" "+s1;
		}
		System.out.println(s1);
	}

}
