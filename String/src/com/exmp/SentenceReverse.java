package com.exmp;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SentenceReverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the String.");
	    String str=scan.nextLine();
	    String str1="";
	    StringTokenizer stk = new StringTokenizer(str," ");
	    while(stk.hasMoreTokens()==true){
	    	str1=stk.nextToken()+" "+str1;
	    }
	    System.out.println(str1+" ");
        scan.close();
	}

}
