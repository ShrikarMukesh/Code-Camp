package examples.geeksforgeeks;

import java.util.Scanner;

public class MissingNumberInArray {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		find();
	}
	static void find() {
		
		
		int at1 = scanner.nextInt();
		int[] array1 = new int[at1];
		
		for(int i =0;i<array1.length;i++) {
			int num = scanner.nextInt();
			array1[i] = num;
		}
		
		
		/*for(int i =0;i<array1.length;i++) {
			int num = i+1;
			array1[i] = num;
		}*/
		for(int i =0;i<array1.length;i++) {
			System.out.println(array1[i]);
		}
	}
	
}
