package org.prac.core.java.serialization;

import java.io.IOException;

public class DemoClassWithChange {

	
	public static void main(String[] args) throws IOException {
		DemoClass ex = new DemoClass();
		ex.writeOut(ex);
		
		
	}
}
