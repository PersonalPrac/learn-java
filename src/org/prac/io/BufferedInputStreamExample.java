package org.prac.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

//https://www.javatpoint.com/
public class BufferedInputStreamExample {
	public static void main(String[] args) throws IOException {
		// Should execute BufferedOutputStreamExample.java to generate "bfos.txt" File
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("bfos.txt"));
		
		int byteData;
		
		while( (byteData=bis.read()) != -1) {
			System.out.print((char)byteData);
		}
			
		bis.close();
	}

}
