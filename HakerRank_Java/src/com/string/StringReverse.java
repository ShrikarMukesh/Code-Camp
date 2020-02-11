package com.string;

import java.util.Scanner;

public class StringReverse {
	
	public static void main(String[] args) {

		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		
		StringBuffer s = new StringBuffer(A);
		StringBuffer rs = s.reverse();
		String st = rs.toString();
		System.out.println(rs);
		
		if(st.equals(A)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}
}
