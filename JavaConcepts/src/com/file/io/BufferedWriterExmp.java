package com.file.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExmp {
	public static void main(String[] args) {
		BufferedWriter bwr = null;
		File file;
		String mycontent = "This will be BufferWriterFile" + "Buffer Writer FIle";
		try {
			file = new File("D://Java//file_IO//BufferedWriterExmp.txt");

			if(!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
			bwr =  new BufferedWriter(fw);
			bwr.write(mycontent);
			System.out.println("File written Successfully");

		}catch(IOException e){
			e.printStackTrace();
		}
		finally {
			try{
				if(bwr!=null) {
					bwr.close();
				}
			}catch(Exception ex){
				
				System.out.println("Error in closing the BufferedWriter"+ex);
			}
		}
	}
}
