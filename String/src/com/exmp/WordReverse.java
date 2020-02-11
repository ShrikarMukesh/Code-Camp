package com.exmp;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordReverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the String.");
	    String str=scan.nextLine();
	    String str1="";
	    StringTokenizer stk = new StringTokenizer(str," ");
	    while(stk.hasMoreTokens()==true)
	    {
	    	str1=stk.nextToken();
	    	StringBuffer sb = new StringBuffer(str1);
	        System.out.print(sb.reverse()+" ");
	    }
	    scan.close();
	}
}
