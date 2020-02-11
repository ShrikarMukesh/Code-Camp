package com.java;

import java.io.IOException;
import java.util.Scanner;


public class JavaEndOfFile {

	public static void main(String[] args) throws IOException {

		/*File file = new File("text.txt"); 

		BufferedReader br = new BufferedReader(new FileReader(file)); 

		String st; 
		while ((st = br.readLine()) != null) {
			System.out.println(st); 
		} 
		br.close();*/

		String str = "Hello world\r\n" + 
				"I am a file\r\n" + 
				"Read me until end-of-file.";

		Scanner scan = new Scanner(str);
		for(int i = 1; scan.hasNext()== true; i++){
			System.out.println(i + " " + scan.nextLine());
		}
		scan.close();
		System.out.println("********Second way of doing It********");
		 Scanner scanner = new Scanner(str);
		int i = 0;
		while(scanner.hasNext()){
			i++;
			System.out.println(i + " " + scanner.nextLine());
		}
		scanner.close();


	} 
}
