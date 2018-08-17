# Abstract Classes

As we move up the inheritace hierarchy, classes become more general and probably more abastract. At some point, the ancestor class becomes so general that you think of it more as a basis for other classes than a class which you want to instantiate. 

Consider for example car, in real life we can have different implementation of car like **TeslaCar**, **AudiCar** etc. It is good to create a more general **Car** class and to put all the general methods and instance variables in that class because the basic prototype for every car is same. All that change is how a particular manufacturer implement those basic functionalities.

A point to look on is that the existence of **Car** object dosen't make any sense, all that matter is the existence of those that implemented it. In our case **TeslaCar** and **AudiCar**.

This is where **Abstract Classes** comes into play. When you make a class **abstact** then you are ensuring that no one can create an object of that class. Along with **Abstract Classes** we have **Abstract Methods**. By marking a method **abstract** we are ensuring that we are just providing method declaration and no definition.

Whenever we add an **abstarct** method in a class then we must also declare that class **abstract**. But the vice versa is not true if a class is **abstract** then it may or may not have **abastact** method. Many programmers think that **Abstract Classes** are house to **Abstarct Methods**, no they are so much more !!. Along with abstact methods they can have instance variables as well as concrete methods.

**Abstract Methods** act as a placeholder for methods that are implemented in subclasses. When we extend an **Abstact Class** we have two choices either to define all the **Abstact Methods** and make a **Concrete SubClass** or to leave some (or all) of the **Abstract Methods** undeclared and mark the subclass **abstract** as well.

```
Note: By Concrete Class I mean the class which can be instantiated, ie. The class whoose objects can be created. 
```

A very intresting thing to note about **Abstract Classes** is that, Although we can not instantiate them but we still can create object references of **Abstract Class**. These object references must refer to an object of a **Concrete SubClass**. For example,

```java
Car c = new TeslaCar("Model S", 4, 250.0);
```

