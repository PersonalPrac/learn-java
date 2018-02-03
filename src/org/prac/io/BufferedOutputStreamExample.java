package org.prac.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//https://www.javatpoint.com/
public class BufferedOutputStreamExample {
	public static void main(String[] args) throws IOException {

		BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("bfos.txt"));
		bout.write("Welcome to Buffered Output Stream Example".getBytes());
		bout.write("Welcome to Buffered Output Stream Example".getBytes());
		bout.write("Welcome to Buffered Output Stream Example".getBytes());
		bout.write("Welcome to Buffered Output Stream Example".getBytes());
		bout.write("Welcome to Buffered Output Stream Example".getBytes());

		// This forces any buffered output bytes to be written out to the underlying
		// output stream.
		bout.flush();
		bout.close();
		System.out.println("-- Success --");

	}
}
