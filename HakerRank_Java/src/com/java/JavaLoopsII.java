package com.java;
import java.util.Scanner;
class JavaLoopsII {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of input");

		int t=in.nextInt();
		for(int i=0;i<t;i++){
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			
			for(int m =0; m<n; m++) {

				a  = (int) (a + b * Math.pow(2, m));
				System.out.println(a);
			}
		}
		in.close();
	}

}
