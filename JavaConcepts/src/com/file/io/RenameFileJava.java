package com.file.io;

import java.io.File;
import java.io.IOException;

public class RenameFileJava {
	public static void main(String[] args) throws IOException
	{	
		//Old File
		File oldfile =new File("D://Java//File_IO//deletefile.txt");
		if(!oldfile.exists()) {
			oldfile.createNewFile();
		}
		//New File
		File newfile =new File("D://Java//File_IO//rename.txt");
		/*renameTo() return boolean value
		 * It return true if rename operation is
		 * successful
		 */
		boolean flag = oldfile.renameTo(newfile);
		if(flag){
			System.out.println("File renamed successfully");
		}else{
			System.out.println("Rename operation failed");
		}
	}
}
