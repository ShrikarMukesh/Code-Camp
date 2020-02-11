package com.java;

import java.util.Scanner;

class JavaOutPutFormatting {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("================================");
		for(int i=0;i<3;i++){

			String s1=sc.next();
			int x=sc.nextInt();

			int flag = s1.length();
			for(int m = flag; m <15; m++) {
				s1 = s1+" ";
			}
			
			String 	 formatted = String.format("%03d", x);
			System.out.println(s1 +""+formatted);

		}
		sc.close();
		System.out.println("================================");	
	}
}
