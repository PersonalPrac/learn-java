package org.prac.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;

//https://www.javatpoint.com/java-bytearrayinputstream-class
//example of java ByteArrayInputStream class to read byte array as input stream
public class ByteArrayInputStreamExample {
public static void main(String[] args) throws IOException {
	
	byte[] buf = {34, 56, 1, 0, 98};

	/*
	FileInputStream fin = new FileInputStream("f1.txt");
	int byteStream, i=0;
	while( (byteStream=fin.read()) != -1) {
		System.out.print((char)byteStream);
		buf[i] = byteStream.get
	}*/
		
	ByteArrayInputStream byt = new ByteArrayInputStream(buf);
	
	int data;
	
	while ( (data = byt.read()) != -1) {
		// Prints ASCII Values
		System.out.println((char)data);
	}
}
}
