package com.arrays;

public class DiagonalDifference {
	public static void main(String[] args) {
		
		int mat[][] = {  { 11, 2, 4}, 
				         { 4, 5, 6 }, 
				         { 10, 8,-12} 
				      }; 
		
		diagonalDifference(mat); 
		
	}
	static int diagonalDifference(int[][] arr) {
		System.out.println("Length of the array");
		int n = arr.length;
		System.out.println(n);
		int primaryDiagonal = 0;
		int secondaryDiagonal = 0;
		System.out.println("The matrix");
		for (int row = 0; row < arr.length; row++) {
			
			// Loop through all elements of current row 
			for (int col = 0; col < arr[row].length; col++) { 
				
				System.out.print(arr[col][row] + " "); 
				if (row == col) {
                    primaryDiagonal = primaryDiagonal + arr[row][col];
                } 
                if (row + col ==  n - 1) {
                    secondaryDiagonal =secondaryDiagonal+ arr[row][col];
                }
			}
			System.out.println();
		}
		System.out.println("primaryDiagonal = "+primaryDiagonal);
		System.out.println("secondaryDiagonal = "+secondaryDiagonal);
		int absoluteDifference = Math.abs(primaryDiagonal - secondaryDiagonal);
        System.out.println("AbsoluteDifference = "+absoluteDifference);
		return absoluteDifference;
		
	}

}
