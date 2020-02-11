package com.exmp;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Capitalization {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the line");
		String str=sc.nextLine();
		StringBuffer sb = new StringBuffer(str.length());
		String[] arr=str.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			sb.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1)).append(" ");
		}
		String s2=new String(sb);
		String temp="";
		StringTokenizer stk=new StringTokenizer(s2," ");
		while(stk.hasMoreTokens())
		{
			temp=stk.nextToken()+" "+temp;
		}
		System.out.print(temp);

		sc.close();

	}

}
