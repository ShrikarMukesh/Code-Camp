package com.exmp;

import java.util.Scanner;

public class ASCIIValue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a character");
		char ch=scan.next().charAt(0);
		int i=ch;
		System.out.println("ASCII value of"+ ch +"is"+ i);
        scan.close();
	}

}
