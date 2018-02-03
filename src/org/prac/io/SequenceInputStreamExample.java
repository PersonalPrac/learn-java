package org.prac.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

//https://www.javatpoint.com/
public class SequenceInputStreamExample {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("fos.txt");
		FileInputStream fisOther = new FileInputStream("bfos.txt");
		
		SequenceInputStream sis = new SequenceInputStream(fis, fisOther);
		
		int readData;
		
		while ((readData = sis.read()) != -1) {
			System.out.print((char)readData);
		
		}
		fis.close();
		fisOther.close();
		sis.close();

	}
}
