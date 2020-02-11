package com.string;

import java.util.Scanner;

public class StringIntro {
	public static void main(String[] args) {

		String s = "shrikarMukesh";
		String subStr = s.substring(3, 7);
		System.out.println(subStr);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the strings");
		String A=sc.next();
		String B=sc.next();
		
		int a = A.length(); 
		int b = B.length();
		System.out.println(a+b);
		System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
		System.out.println(capFirstLetter(A) + " " + capFirstLetter(B));
		sc.close();
	}
	private static String capFirstLetter(String str) {
		
        if (str == null || str.length() == 0) {
            return "";
        } else {
            return str.substring(0,1).toUpperCase() + str.substring(1);
        }
    }
}
