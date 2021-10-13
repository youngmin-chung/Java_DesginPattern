### What is the Visitor Design Pattern?

* Allows you to add methods to classes of different types without much altering to those classes
* You can make completely different methods depending on the class used
* Allows you to define external classes that can extend other classes without majority editing them

### Intent

* Object Behavioral
* To represent an operation to be performed on exisiting classes, without changing those classes

### Motivation

* Consider an image editor
* Images are made of layers, layers are made of shapes.
* If we wnat to save the image how do we do it?
  * Go through each layer, go through each shape, save each shape.
* If we want to save it to multiple different formats, how do we do it?
  * Different formats may save specific shpaes differently 
  * Go through each layer & format, go through each shape & format, save 
  * That's a lot of loops!
* Shapes can differ in how they save
* File formats can differ in how they save
* Both can depend on each other for special savin gmethodology!!
* Lots of duplicated code, lots of very speicific functions being written on both Shape and FileFormat
* Instead - implement each file format as a Visitor subclass
* Visitor and Shape have a "handshake"

### Details
* ConcreteElement class implements a method: Accept(Visitor v), which then calls a specific method on Visitor that accepts the ConcreteElement
* The idea is that ConcreteElement.Accept(Visitor v) is called from the client;
* The Visitor, which is concrete, is told to visit ConcreteElement (with a method called VisitConcreteElement());
* And now the ConcreteVisitor can now do type-specific operations as it knows both what it's operating on and its own class.

### Applicability
* Use when:
  * An object structure contains many differing interfaces and you want to perform operations that depend on their concrete classes
  * Many unrelated operations need to be performed on objects in a structure and you want to avoid making those objects' interfaces bulky
  * Classes defining object structure rarely change, but you often define new operations on it
  * Like an image editor's layers vs. file export types

### Participants
* Visitor (Visitor)
  * Declares Visit for each class of ConcreteElement in the object structure; Visitor determines which type of Visit to call
  * i.e. Visitor.VisitCircle, Visitor.VisitText, …
* ConcreteVisitor (TaxVisitor, TaxHolidayVisitor)
  * Implements each Visitor operation
* Element (Visitable)
  * defines Accept(Visitor v) operation
* ConcreteElement (Liquor, Tobacco, Necessity, Perfume)
  * implements Accept(Visitor v) operation
