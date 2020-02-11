package com.exmp;
import java.util.Scanner;
public class MatrixMultiplication {
	public static void main(String args[]) {

		int sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number of Rows and Columns of First Matrix : ");
		int m = in.nextInt();
		int n = in.nextInt();
		int first[][] = new int[m][n];
		System.out.print("Enter First Matrix Elements : ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				first[i][j] = in.nextInt();
			}
		}

		System.out.print("Enter Number of Rows and Columns of Second Matrix : ");
		int p = in.nextInt();
		int q = in.nextInt();
		int second[][] = new int[p][q];
		System.out.print("Enter Second Matrix Elements :\n");
		for (int i = 0; i < p; i++) {
			for (int j = 0; j < q; j++) {
				second[i][j] = in.nextInt();
			}
		}
		
		if (n != p) {
			System.out.print("Matrix of the entered order can't be Multiplied..!!");
		}
		int result[][] = new int[m][q];
		System.out.println("Multiplying both Matrix...\n");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < q; j++) {
				for (int k = 0; k < p; k++) {
					sum = sum + first[i][k] * second[k][j];
				}

				result[i][j] = sum;
				sum = 0;
			}
		}

		System.out.print("Multiplication Successfully performed..!!\n");
		System.out.print("Now the Matrix Multiplication Result is :\n");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < q; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		in.close();
	}
}
