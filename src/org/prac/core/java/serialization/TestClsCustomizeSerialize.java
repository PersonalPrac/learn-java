package org.prac.core.java.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Inet Page E10
// Special requirement like writing Static information... then we can implement special methods readObject, writeObject
public class TestClsCustomizeSerialize implements Serializable{

	private static final long serialVersionUID = -415475862427534457L;
	
	public static int svOne;
	public static String svTwo;
	public int ivOne;
	public String ivTwo;
	
	// These are private methods. Default readObject() method will call this.
	private void readObject(ObjectInputStream ios) throws IOException, ClassNotFoundException{
		svOne = ios.readInt();
		svTwo =(String) ios.readObject();
		ivOne = ios.readInt();
		ivTwo = (String)ios.readObject();
	}
	
	// These are private methods. Default writeObject() method will call this.
	private void writeObject(ObjectOutputStream oos) throws IOException{
		oos.writeInt(svOne);
		oos.writeObject(svTwo);
		oos.writeInt(ivOne);
		oos.writeObject(ivTwo);
	}

	@Override
	public String toString() {
		return "TestCls [ivOne=" + ivOne + ", ivTwo=" + ivTwo + ", svOne=" + svOne + ", svTwo=" + svTwo + "]";
	}

	
	
}
