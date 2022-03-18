# Pass by value vs Pass by reference
- in main class create an add method that takes a number and adds 1 to it -> call the method and print the result
- create a class with at least one field
- in main class create a method that changes the reference and a method that modifies the field
- check also the wrapper classes

# Interfaces
- create an interface Greeting with a field that holds the greeting (try private and default) and 3 methods (a regular
  one, a default one and a static one)
- create a 2nd interface that extends the 1st one
- create a 3rd interface, with one method with the same name as one from the 2nd, same params and same return type
- create a 4th interface, with a method as the one from the 3rd interface, but different return type
- create a class that implements interface 2 and 3
- (towel, tissue, notebook - wipeable, writeable, foldable)
- check out functional interfaces - Runnable
- check out marker interfaces - Serializable

| Abstract class  (A is a B)                                                                                                                                                                                                                                                                                                                                                                  | Interface    (A is capable of B)                                                                                                                                                                                                                                                                                                                                                                                                                                |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| - When trying to use the inheritance concept in code (share code among many related classes), by providing common base class methods that the subclasses override <br> - While classes that extend abstract classes have several common fields or methods (that require non-public modifiers) <br> - If one wants to have non-final or non-static methods to modify the states of an object | - If the problem needs to be solved using multiple inheritances and is composed of different class hierarchies <br> - When unrelated classes implement our interface. For example, Comparable provides the compareTo() method that can be overridden to compare two objects <br> - When application functionalities have to be defined as a contract, but not concerned about who implements the behavior. i.e., third-party vendors need to implement it fully |


# Comparator and Comparable
- create a class Book with fields year, title and author, and have it implement Comparable
- create an array of books and sort the array ("natural order")
- create a TitleComparator and an AuthorComparator class which implement Comparator
- sort the array of books using these comparators
