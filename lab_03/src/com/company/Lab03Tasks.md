# Singleton
[//]: # (A private constructor)
[//]: # (A static field containing its only instance)
[//]: # (A static factory method for obtaining the instance)
### Early Instantiation
- with instance created in the class and factory that returns that instance
### Lazy Instantiation
- with instance being created in the factory method, with null check

 
# Abstract class
- create an abstract class with some instance fields and two abstract methods and one concrete method
- extend the abstract class and implement the methods
 
# Composition and aggregation
[//]: # ( Aggregation -> HAS-A relationship; unidirectional, e.g. department can have students)
[//]: # ( both entities survive individually, ending one will not affect the other)
- create a class Student (with some relevant fields) and a class Department (with relevant fields) which contains a list of students

[//]: # (Composition: restricted form of Aggregation where two entities are highly dependent on each other)
[//]: # (the composed object cannot exist without the other entity)
- create a class Sale (with some relevant fields) and a SaleArticle (with some relevant fields). Sale should include a list of SaleArticles

# String
- create a String with a literal and by using new -> compare equality ; then use intern() on the 2nd string and compare again
- modify the 1st string by calling toUpper() and then printing the string
- methods: length, substring, charAt, compareTo, toLowerCase, trim, indexOf, startsWith, endsWith, valueOf
- regex: https://regexr.com/ - matches, replaceAll, split

# StringBuilder & StringBuffer
- create a StringBuilder and append several Strings, reverse

# Immutability
[//]: # (To make a class immutable it must:)
[//]: # (not be extended)
[//]: # (setters should not exist or throw exceptions if they do)
[//]: # (getters should return clones of mutable fields)
[//]: # (constructors should store clones of mutable parameters)
- create a class with 2 private fields (one is a LocalDate) and make it immutable

# Pass by value vs Pass by reference
- in main create an add class that takes a number and adds 1 to it -> call the method and print the result
- create a class with at least one field
- in main create a method that changes the reference and a method that modifies the field
- check also the wrapper classes
