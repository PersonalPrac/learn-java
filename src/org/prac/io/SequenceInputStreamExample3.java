package org.prac.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Vector;

//https://www.javatpoint.com/
//example that reads data using enumeration

public class SequenceInputStreamExample3 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("fos.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileInputStream fisOther = new FileInputStream("bfos.txt");
		BufferedInputStream bisOther = new BufferedInputStream(fisOther);
		
		FileInputStream fisOther2 = new FileInputStream("seqfos.txt");
		BufferedInputStream bisOther2 = new BufferedInputStream(fisOther2);
		
		Vector<BufferedInputStream> vectorObj = new Vector<>();
		vectorObj.add(bis);
		vectorObj.add(bisOther);
		vectorObj.add(bisOther2);
		
		
		SequenceInputStream sis = new SequenceInputStream(vectorObj.elements());
		
		int readData;
		
		while ((readData = sis.read()) != -1) {
			System.out.print((char)readData);
		}
		sis.close();
		bisOther2.close();
		fisOther2.close();
		bisOther.close();
		fisOther.close();
		bis.close();
		fis.close();
		
		System.out.println("--Success--");
	}
}
