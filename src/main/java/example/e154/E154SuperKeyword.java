package org.example.e154;
/*
In Parent Class.

Create a no-argument constructor and include the logic to print "Parent Constructor without argument"

Create another constructor that takes one parameter of integer type called number.

include the logic to print the value of the number.

In Child class.

Create a Constructor without parameter and include the logic to print "Child Constructor without argument"

Overload the constructor by adding one parameter of type integer

Inside the constructor call the parameterized parent class constructor.

In Main Class.

Create an object of Child without passing any argument.

And then another object of Child class by passing the value "10". run the application.



**Output:**

```
Parent Constructor without argument
Child Constructor without argument
10
 */

class Parent{

    Parent(){
        System.out.println("Parent Constructor without argument");
    }
    Parent(int number){
        System.out.println(number);
    }

}

class Child extends Parent {
    Child(){
        System.out.println("Child Constructor without argument");
    }
    Child(int number){
        super(number);

    }

}
public class E154SuperKeyword {
    public static void main(String[] args) {
Child obj1=new Child();
Child obj2=new Child(10);
    }
}
