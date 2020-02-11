package com.exmp;

import java.util.StringTokenizer;

public class SentenceReverse1 {

	public static void main(String[] args) {
		String s = "hi hello how are you?";
		//String temp="";
		StringTokenizer stk=new StringTokenizer(s," ");
		while(stk.hasMoreTokens()==true)
		{
	
	
			StringBuffer sb = new StringBuffer(stk.nextToken());
			sb.reverse();
		    System.out.print(sb+" ");
		}

	}
}