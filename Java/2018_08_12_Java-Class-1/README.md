## Initial Setup Instructions

- [Installing JDK + JRE](https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html)

- [Installing Jetbrains](https://www.jetbrains.com/help/idea/install-and-set-up-product.html)

- [Setting Up Windows cmd For Java](https://introcs.cs.princeton.edu/java/15inout/windows-cmd.html)

## Resources

- [Head First Java](https://ia601308.us.archive.org/35/items/HeadFirstJava2ndEdition/Head-First-Java-2nd-edition.pdf): One of the best Java book for beginners.

- [Core Java Volume 1](http://www2.nsru.ac.th/tung/java_doc/Core%20Java%20Volume%20I-%20Fundamentals%209th%20Edition-%20Horstmann,%20Cay%20S.%20&%20Cornell,%20Gary_2013.pdf): Covers both basics and advanced topics in Java, Highly recommened for those who are already familiar with Java.

- [The Complete Java Reference](http://iiti.ac.in/people/~tanimad/JavaTheCompleteReference.pdf): Another great book covering basics of Java in crisp and concise manner.

- [Oracle Docs](https://docs.oracle.com/javase/tutorial/): Best resource for learning Java, all you have to learn is how to search the docs :P. Recommend for advanced users.

- [Java TPoint](https://www.javatpoint.com/): Great online resource for learning Java concepts.

## Code

wget [this](Test.java) url for raw cpp file.

```java

/*
 * To compile this program run [ javac Test.java ]on terminal (Please follow instruction in link to setup java for cli)
 * Link : https://introcs.cs.princeton.edu/java/15inout/windows-cmd.html
 * To run this program run [ java Test ]
 */

import java.util.*;

/**
 * This program demonstrates object construction along with static methods.
 * @version 1.01 12-08-2018
 * @author Abhey Rana
 */
public class Test
{
   public static void main(String[] args)
   {
      // Fill the staff array with three Employee objects
      Employee[] staff = new Employee[3];

      staff[0] = new Employee("Abhey Rana", 40000);
      staff[1] = new Employee(60000);
      staff[2] = new Employee();

      // Print out information about all Employee objects
      for (Employee e : staff)
         System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary="
               + e.getSalary());

      // If above loop doesn't seem familar then google it. You will learn a new thing.

      int n = Employee.getNextId(); // calls static method
      System.out.println("Next available id=" + n);
   }
}
/*
 * Please note that in one Java file there can be only one public class.
 * Also the name of class that is made public must match with the name of file.
 * Here in our case Test is the public class used for testing purposes (Note name of file is Test.java)
 * Also Employee is the class that is encaspulating the functionality of a Employee
 */

class Employee
{
   private static int nextId = 0;

   // Always remember make Instance variables (Object Variables) private and provide Accessor and Mutator Methods.

   private int id;
   private String name = ""; // Instance field initialization
   private double salary;

   // Three overloaded constructors
   public Employee(String name, double salary)
   {
      this.name = name;
      this.salary = salary;
      this.id = nextId;
      Employee.nextId ++;
   }

   public Employee(double salary)
   {
      // Calls the Employee(String, double) constructor
      // Remember call to another constructor via this keyword should be made in the very first line.
      this("Employee #" + nextId, salary);
   }

   // The default constructor
   public Employee()
   {
      // name initialized to "" --see above
      // salary not explicitly set--initialized to 0
      this.id = nextId;
      Employee.nextId ++;
   }

   // Accessor Methods (Or Getter Methods)
   public String getName()
   {
      return this.name;
   }

   public double getSalary()
   {
      return this.salary;
   }

   public int getId()
   {
      return this.id;
   }

   // Mutator Methods (Or Setter Methods)
   public void setName(String name){
      this.name = name;
   }

   public void setSalary(double salary){
      // Check to see if someone is not setting negative salary
      if(salary > 0)
         this.salary = salary;
   }

   // See not all insatnce members require Mutator Method, here we don't want to change ID so we don't have a mutator for it.

   public static int getNextId()
   {
      return nextId; // returns static field
   }

   // Look each class can have it's own main method. (Here this one is for testing purposes)
   public static void main(String[] args)
   {
      Employee e = new Employee("Harry", 50000);
      System.out.println(e.getName() + " " + e.getSalary());
   }

}


```

We encourage you to run code and feel free to experiment with it. In case of any doubt just ping any of the co-ordinators we are always here to help :)