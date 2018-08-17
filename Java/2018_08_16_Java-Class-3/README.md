# Abstract Classes

As we move up the inheritace hierarchy, classes become more general and probably more abastract. At some point, the ancestor class becomes so general that you think of it more as a basis for other classes than a class which you want to instantiate. 

Consider for example car, in real life we can have different implementation of car like **TeslaCar**, **AudiCar** etc. It is good to create a more general **Car** class and to put all the general methods and instance variables in that class because the basic prototype for every car is same. All that change is how a particular manufacturer implement those basic functionalities.

A point to look on is that the existence of **Car** object dosen't make any sense, all that matter is the existence of those that implemented it. In our case **TeslaCar** and **AudiCar**.

This is where **Abstract Classes** comes into play. When you make a class **abstact** then you are ensuring that no one can create an object of that class. Along with **Abstract Classes** we have **Abstract Methods**. By marking a method **abstract** we are ensuring that we are just providing method declaration and no definition.

Whenever we add an **abstarct** method in a class then we must also declare that class **abstract**. But the vice versa is not true if a class is **abstract** then it may or may not have **abastact** method. Many programmers think that **Abstract Classes** are house to **Abstarct Methods**, no they are so much more !!. Along with abstact methods they can have instance variables as well as concrete methods.

**Abstract Methods** act as a placeholder for methods that are implemented in subclasses. When we extend an **Abstact Class** we have two choices either to define all the **Abstact Methods** and make a **Concrete SubClass** or to leave some (or all) of the **Abstract Methods** undeclared and mark the subclass **abstract** as well.

Note: By Concrete Class I mean the class which can be instantiated, ie. The class whoose objects can be created. 

A very intresting thing to note about **Abstract Classes** is that, Although we can not instantiate them but we still can create object references of **Abstract Class**. These object references must refer to an object of a **Concrete SubClass**. For example,

```java
Car c = new TeslaCar("Model S", 4, 250.0);
```

Now let us define our **Abstract Class** Car about which we were discussing so long.

```java
/**
 * This program demonstrate Abstract Class.
 * @version 1.01- 17-08-2018
 * @author Abhey Rana
 */

import java.util.Calendar;
import java.util.Date;

public abstract class Car{

	// Abstract Class can also have instance variables .....

	private String modelName;
	private int passengerCapacity;
	private double topSpeed;
	private Date manufacturingDate;

	// Abstract Class can have constructor just like other classes ....

	public Car(String modelName, int passengerCapacity, double topSpeed){
		this.modelName = modelName;
		this.passengerCapacity = passengerCapacity;
		this.topSpeed = topSpeed;
		this.manufacturingDate = Calendar.getInstance().getTime();
	}

	// Abstract Methods

	public abstract void accelerate();
	public abstract void brake();
	public abstract String getDescription();

	// Accessor Methods (See Abstract Class can also have concrete methods)

	public String getModelName(){
		return this.modelName;
	}

	public int getPassengerCapacity(){
		return this.passengerCapacity;
	}

	public double getTopSpeed(){
		return this.topSpeed;
	}

	public Date getManufacturingDate(){
		return this.manufacturingDate;
	}

	// Mutator Methods

	public void setModelName(String modelName){
		this.modelName = modelName;
	}

	public void setPassengerCapcity(int passengerCapacity){
		this.passengerCapacity = passengerCapacity;
	}

	public void setTopSpeed(double topSpeed){
		this.topSpeed = topSpeed;
	}

}


```

Now let's define our concrete subclasses namely **TeslaCar** and **AudiCar**

```java
/**
 * This program demonstrate Concrete SubClasses of Car Abstract Class.
 * @version 1.01- 17-08-2018
 * @author Abhey Rana
 */

class TeslaCar extends Car{

	public TeslaCar(String modelName, int passengerCapacity, double topSpeed){
		super(modelName, passengerCapacity, topSpeed);
	}

	// Overriding Abstract methods

	public void accelerate(){
		System.out.println("Tesla's specialized acceleration system");
	}

	public void brake(){
		System.out.println("Tesla's specialized braking system");
	}

	public String getDescription(){
		return "Tesla Car, Model Name: " + this.getModelName() + ", Top Speed: " + this.getTopSpeed();
	}

}

class AudiCar extends Car{

	public AudiCar(String modelName, int passengerCapacity, double topSpeed){
		super(modelName, passengerCapacity, topSpeed);
	}

	// Overriding Abstract methods

	public void accelerate(){
		System.out.println("Audi's specialized acceleration system");
	}

	public void brake(){
		System.out.println("Audi's specialized braking system");
	}

	public String getDescription(){
		return "Audi Car, Model Name: " + this.getModelName() + ", Top Speed: " + this.getTopSpeed();
	}

}
```

Finally let's create our AbstractTest Class which will act as a driver class and will illustrate all the concepts disucssed till now.

```java
/**
 * This program demonstrate AbstractTest driver class
 * @version 1.01- 17-08-2018
 * @author Abhey Rana
 */

 public class AbstractTest{

 	public static void main(String args[]){

 		Car[] showroom = new Car[3];

 		showroom[0] = new TeslaCar("Model S", 4, 250.0);
 		showroom[1] = new AudiCar("Audi A3", 4, 240.0);
 		showroom[2] = new TeslaCar("Model X", 4,210.0);

 		for(Car c: showroom)
 			System.out.println(c.getDescription());

 	}

 }

```

#### Why to make methods of Car class abstract ? Can we not just leave their method definition empty ? Will it not serve the purpose ?

Yeaah we can leave the method definiton of those abstract method empty and surely it will serve the purpose in current scenario. But by making a method **abstract** we are ensuring that every **Concrete SubClass** that extends **Car** class will override these methods which will further ensure that none of those classes are using the default implementation of any of the **abstract** methods of Car class.

# Interface

Interfaces in Java are a way of describing **what** classes should do without specifiying **how** they should do it. In the Java programming language, an interface is not a class but a set of **requirements** that the implementing classes must conform to. 

Typically, the supplier of some service states:

> If your class conforms to a particular interface, then I will perform the service

In layman terms you can think of an interface as a contract, which once you sign then you have to abide by it's terms and conditions. And the terms and conditions in case of Java interface is to override all the methods of interface.

In Java Interface all the methods are by default **public** and **bstract**. Even if you mark a method as **public abstract** then also Java complier won't complain. But it you try to make method **private** or **protected** then Java compiler will raise an error.

Just like Abstract Classes, Interfaces can't be instantiated but they can have still have Object Refrences which will refer to objects of implementing classes.

A major diffirence between Java Interfaces and Abstract Classes is that, Interfaces can't have instance members and concrete methods(like consructor, accessor methods, mutator methods etc).

