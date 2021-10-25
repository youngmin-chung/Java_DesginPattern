### Classification
* Factory Method is a Class Creational pattern

### Intent
* Define an interface for creating an object, but let subclasses decide which class to instantiate
* Factory Method lets a class defer instantiation to subclasses

### A.K.A
* virtu constructor

### Motivation
* Frameworks use abstract classes to define relationships between objects
* Consider a framework for creating mobile applications, targeted at both iOS and Android
* Both would need to create controls like popups, textboxes, and scrollbars
* The compiler that builds these two applications from a single code base would need to generate two separate applications, and two versions of each control
* This could be implemented with a factory method
* At compile time, the iOS and Android specific methods to create each control would be called.

### Applicability
* Use the Factory Method when
  * A class can’t anticipate the class of objects it must create
  * A class wants its subclasses to specify the objects it creates
  * Classes delegate responsibility to one of several helper subclasses, and you want to localize the knowledge of which helper subclass is the delegate
  * The Factory Method itself localizes the information about helpers
  * The product of the Factory method is the delegate
  * More on this later

### How is it Class Creational?
* "Creational class patterns defer some part of object creation to subclasses" (GoF , 10)
* In this case, the base factory class handles some of the creation
* However, subclassing allows for easy creation of additional types
* Another way to look at it is that creation is deferred to the factory class and its subclasses
