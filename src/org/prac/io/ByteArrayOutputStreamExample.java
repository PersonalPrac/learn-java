package org.prac.io;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//https://www.javatpoint.com/
//example of java ByteArrayOutputStream class to write common data into 2 files: f1.txt and f2.txt.
public class ByteArrayOutputStreamExample {
public static void main(String[] args) throws IOException {
	
	ByteArrayOutputStream baout = new ByteArrayOutputStream();
	baout.write("Testing: write data to multiple files".getBytes());
	
	FileOutputStream fout1=new FileOutputStream("f1.txt");    
    FileOutputStream fout2=new FileOutputStream("f2.txt");    
    
      
    baout.writeTo(fout1);
    baout.writeTo(fout2);
    
    baout.flush();
    baout.close();
    
    System.out.println("--Success---");
}
}
