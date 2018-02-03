package org.prac.io;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		int readData = System.in.read();
		System.out.println("ASCII CODE OF CHARACTER:"+readData);
		System.out.println("Char Data:"+(char)readData);
		System.out.println("this is out put stream");
		System.err.println("hello this is error");
	}
}
