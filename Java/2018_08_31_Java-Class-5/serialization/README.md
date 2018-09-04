## Serialization

As a part of user experience, one must have come across situations when he/she has saved some data on a website, then logged out of the site, and on logging in again to the website, again the saved data appears on the website. So how does this happen???

The first intuition that occurs in mind is ----> DATABASES!!

Well you're absolutely right! Cheers!! 
But ever wondered, that there must be some criteria for the data to be stored on the database. There are some rules for storing data on the database. Not every kind of data can be stored.

Here comes the concept of serialization. Serialization of an object is simply storing an object in a stream or externally on a disk (in the form of files). 

Example code:

```java
import java.io.*;
class Student implements Serializable{
	String name;
	String branch;
	int regno;

	public Student(String name, String branch, int regno) {
		this.name = name;
		this.branch = branch;
		this.regno = regno;
	}

}
class Test {
	public static void main(String args[]) {
		Student student = new Student("Rohan", "CSE", 1);
		String fileName = "student.txt";
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(student);
			oos.close();
			fos.close();

			System.out.println("Student object stored in file on disk.");
		} catch(IOException e) {
			System.out.println("Couldn't be serialized");
		}
	}
}
```

In a similar way, you can retrieve the stored object from the file into your java program. Do read about this.

## Serializable interface

The question arises, "Why the serializable interface and what is it??". So here's the mystery disclosed.

Serializable is an interface in the java.io package. Whenever a class implements this interface, it tells the **JVM** or the compiler that objects of this class can be stored on a buffer for use.

You must be wondering where are the implementing methods of this interface!! Oh No!! **Serializable has no methods in its construct. That means no methods to implement for the subclass which implements the interface.** These special kind of interfaces are called **marker interfaces.**

## Marker interfaces

Marker interfaces are those interfaces in java that have **zero** methods in their construct. In easy words, they are empty interfaces. But remember, they are **not futile.**

Marker Interface in java is an interface with no fields or methods within it. It is used to convey to the JVM that the class implementing an interface of this category will have some special behavior.

A normal interface specifies functionality which an implementing class must implement. But a marker interface does not follow that pattern.

Marker interfaces in java:
- Serializable
- Clonable
- Remote

Marker interface in Java e.g. Serializable, Clonnable and Remote is used to indicate something to compiler or JVM that the class implementing any of these would have some special behavior. Hence, if the JVM sees a Class is implementing the Serializable interface it does some special operation on it and writes the state of the object into object stream. 