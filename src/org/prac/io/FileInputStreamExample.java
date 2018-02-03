package org.prac.io;

import java.io.FileInputStream;
import java.io.IOException;

//https://www.javatpoint.com/
public class FileInputStreamExample {

	public static void main(String[] args) throws IOException {
		// Should execute FileOutputStreamExample.java to generate "fos.txt" File
		FileInputStream fin = new FileInputStream("fos.txt");
		// Read Single Character
		//System.out.println((char)fin.read());
		
		// Read all characters in the file
		int byteStream;
		
		while( (byteStream=fin.read()) != -1) {
			System.out.print((char)byteStream);
		}
		fin.close();
	}
}
