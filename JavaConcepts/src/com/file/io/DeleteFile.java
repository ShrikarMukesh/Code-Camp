package com.file.io;

import java.io.*;

public class DeleteFile {
	public static void main(String[] args) throws IOException {
		File f = new File("D://Java//File_IO//deletefile.txt");
		if(!f.exists()) {
            f.createNewFile();
		}
		if(f.delete()) {
			System.out.println(f.getName() + " is deleted!");
		}else{
			System.out.println("Delete failed: File didn't delete");
		}
	}

}
