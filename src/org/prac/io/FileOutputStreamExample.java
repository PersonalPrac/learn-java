package org.prac.io;

import java.io.FileOutputStream;
import java.io.IOException;

//https://www.javatpoint.com/
public class FileOutputStreamExample {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fout = new FileOutputStream("fos.txt");
		
		FileOutputStream fout1 = new FileOutputStream("fos1.txt");
		FileOutputStream fout2 = new FileOutputStream("fos2.txt");
		FileOutputStream fout3 = new FileOutputStream("fos3.txt");
		
		Integer inData = new Integer(256);
		
		// Write Byte
		fout.write(inData);
		fout1.write(inData);
		fout2.write(inData);
		fout3.write(inData);
		
		
		// Write String
		//String str = "Welcome to File Output Stream Prac";
		String str = "File Output Stream usage";
		
		//fout.write(str.getBytes());
		fout.close();
		System.out.println("--Success--");
				
	}
}
