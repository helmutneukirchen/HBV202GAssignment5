# HBV202GAssignment5
A very simple implementation of a stack for storing integer numbers to be tested using JUnit4.

This project is a Maven project, i.e. it uses the standard Maven project structure that your IDE should understand 
when you `git clone` it. 

The provided Maven POM includes the JUnit 5 dependency. 

The POM sets the Java version to 21 as this is the version that the autograder supports.

Both the implementation and the tests are in Java package `is.hi.hbv202g.ass5`, 
but in the usual separate Maven `src` directories:

- `src/main/java`:
  - `IntStack.java`: Implementation of a simple stack.
  - `IntStackMain.java`: A class with a main method demonstrating some sample usage of the stack.

- `src/test/java`:
  - `IntStackTest.java`: A skeleton for a class containing JUnit4 test cases for the `IntStack` class, containing one sample test case.

Maven:

- `mvn compile` compiles all implementation classes.
- `mvn test` runs all test cases (i.e. all classes with a name that either starts with `Test` or ends with `Test`, `Tests`, or `TestCase` -- in our case, this will match `IntStackTest`).

