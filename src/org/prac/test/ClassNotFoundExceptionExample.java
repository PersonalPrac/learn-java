package org.prac.test;

//https://github.com/njnareshjoshi/exercises/edit/master/src/org/programming/mitra/exercises/ClassNotFoundExceptionExample.java
public class ClassNotFoundExceptionExample {
    public static void main(String[] args) throws Exception {

        // NoClassDefFoundError Example
        // Do javac on ClassNotFoundExceptionExample.java,
        // Program will compile successfully because Employee class exits
        // Manually delete Employee.class file
        // Run the program using java ClassNotFoundExceptionExample
        Employee emp = new Employee();
        emp.saySomething();

        // ClassNotFoundException Example
        // Provide any class to Class.forName() which does not exist
        // Or compile ClassNotFoundExceptionExample.java and then manually delete Person.class file so Person class will become unavailable
        // Run the program using java ClassNotFoundExceptionExample
        Class<?> personClass = Class.forName("Person");
        Person person = (Person) personClass.newInstance();
        person.saySomething();
    }

    static class Employee {
        void saySomething() {
            System.out.println("Hello in Employee");
        }
    }

    static class Person {
        void saySomething() {
            System.out.println("Hello in Person");
        }
    }
}