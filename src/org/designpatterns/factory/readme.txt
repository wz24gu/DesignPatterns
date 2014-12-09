The Factory Method Pattern
The Factory Method Pattern defines an interface for creating an object, but lets subclasses decide which class to instantiate.
Factory Method lets a class defer instantiation to subclasses.

Related Design Principles
1. simple factory: an object that is composed by the creator object
2. dependency inversion principle: depend upon abstractions, do not depend upon concrete classes
3. no variable should hold a reference to a concrete class
4. no class should derive from a concrete class
5. no method should override an implemented method of any of its base classes