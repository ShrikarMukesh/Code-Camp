package com.exmp;

import java.util.Scanner;

public class MatrixTranspose {
	public static void main(String args[]) {
		
		int arr[][] = new int[3][3];
		int aransArr[][] = new int[3][3];
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter 3*3 Array Elements : ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		System.out.print("Transposing Array...\n");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				aransArr[j][i] = arr[i][j];
			}
		}

		System.out.print("Transpose of the Matrix is :\n");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(aransArr[i][j] + " ");
			}
			System.out.println();
		}
		scan.close();
	}
}
