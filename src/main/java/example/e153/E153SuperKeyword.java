package org.example.e153;
/*
In parent class

Create a non argument constructor and write a logic to print "This is Parent constructor"

Create a Child Class that will be subclass of the Parent class.

Create a constructor without parameter and call parent class constructor expicitly

In Main Class.

Create and object of Child class and run the application.

**Output:**

```
This
 */

class Parent{

    Parent(){
        System.out.println("This is Parent constructor");
    }

}

class Child extends Parent{
    Child(){
        super();
    }

}
public class E153SuperKeyword {
    public static void main(String[] args) {
Child obj1= new Child();
    }
}
