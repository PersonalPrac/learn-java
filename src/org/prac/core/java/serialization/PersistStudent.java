package org.prac.core.java.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersistStudent {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("persistStudent.txt"));

		Student student = new Student(356, "Test Object Serialization");
		Student.staticVariable = "New Value";
		
		out.writeObject(student);
		
		Student.staticVariable = "After write";
		System.out.println(student);
		out.flush();

		out.close();

		System.out.println("--Success--");
	}
}
