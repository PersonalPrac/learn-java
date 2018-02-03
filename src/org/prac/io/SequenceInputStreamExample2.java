package org.prac.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

//https://www.javatpoint.com/
//Example that reads the data from two files and writes into another file
public class SequenceInputStreamExample2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("fos.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileInputStream fisOther = new FileInputStream("bfos.txt");
		BufferedInputStream bisOther = new BufferedInputStream(fisOther);
		
		FileOutputStream fout = new FileOutputStream("seqfos.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		
		SequenceInputStream sis = new SequenceInputStream(bis, bisOther);
		
		int readData;
		
		while ((readData = sis.read()) != -1) {
			//System.out.print((char)readData);
			bout.write((char)readData);
		}
		sis.close();
		bout.close();
		fout.close();
		bisOther.close();
		fisOther.close();
		bis.close();
		fis.close();
		
		
		System.out.println("--Success--");
	}
}
