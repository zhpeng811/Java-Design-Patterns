# Design Patterns

## Creational Design Patterns
purpose is to abstract the process of instantiating objects

### Builder Pattern
* purpose is to avoid complex constructors
* make object construction more flexible
* **telescoping constructor pattern** (Constructor Overloading) is also complex
* Have a builder class that includes all the setter methods of attributes and a createClass method
* this builder class can have a more abstract builder interface 

### Singleton Pattern
* only one instance of class should be created
* always a private constructor

### Prototype Pattern
* Make editable copies of one original object
* useful when making new objects is memory intensive
* should implement the `Cloneable` interface

### Factory Pattern
* Used when a class does not know exactly what object types need to be created
* makes the code more flexible

### Abstract Factory Pattern
* Use Interface to create families of objects
* Allows code to be decoupled

## Structural Design Patterns
* how classes are structured and interact

### Adapter Pattern
* great for using an existing class that doesn't fit into the class hierarchy

### Bridge Pattern
* separates out cplex hierarchies to reduce coupling and create more flexibility

### Composite Pattern
* treating single and multiple objects uniformly

### Decorator Pattern
* adding additional responsibilities to an object dynamically without affecting other objects of the same type

### Facade Pattern
* Easier to use complex code
* Promotes loose coupling

### Flyweight Pattern
* Help save memory when application is creating a large number of similar objects

### Proxy Pattern
* Help save memory to reduce the number of objects created on app startup