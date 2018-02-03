package org.prac.core.java.serialization;

import java.io.*;

public class TestSerialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException{

    Child child = new Child("Child");
    FileOutputStream fos = new FileOutputStream(new File("file.ser"));
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(child);
    oos.close();

    FileInputStream fis = new FileInputStream(new File("file.ser"));
    ObjectInputStream ois = new ObjectInputStream(fis);
    Object obj = ois.readObject();
    ois.close();

    Child castChild = (Child) obj;

    System.out.println(castChild.getParentString());
    System.out.println(castChild.getChildString());


}

}