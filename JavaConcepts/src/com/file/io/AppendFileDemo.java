package com.file.io;
import java.io.*;
public class AppendFileDemo {
	public static void main( String[] args )
	{	
		try{
			String content = "Shrikar Mukesh " + "Real Madrid";
			//Specify the file name and path here
			File file =new File("D://Java//file_IO//AppendFileDemo.txt");

			/* This logic is to create the file if the
			 * file is not already present
			 */
			if(!file.exists()){
				file.createNewFile();
			}

			//Here true is to append the content to file
			FileWriter fw = new FileWriter(file,true);
			//BufferedWriter writer give better performance
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			//Closing BufferedWriter Stream
			bw.close();

			System.out.println("Data successfully appended at the end of file");

		}catch(IOException ioe){
			System.out.println("Exception occurred:");
			ioe.printStackTrace();
		}
	}
}
