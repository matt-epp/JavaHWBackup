package org.example.e171;
/*
Create an Abstract class Parent which has an abstract method - m1 with zero parameter
and the same method m1 is overriden and has a parameter String myString

Give the implementation for both method then create an object of Main class
and call the m1 method from the implemented class

**Output:**

```
m1 without parameters

m1 method with parameter
 */

abstract class Parent {
    String myString;

    static void m1() {
        System.out.println("m1 without parameters");

    }

    void m1(String myString) {
        System.out.println(myString);
    }

}

class Child extends Parent {

    @Override
    public void m1(String myString) {
        System.out.println(myString);
    }
}

public class E171AbstractClass {


    public static void main(String[] args) {

        Parent.m1();
        Child obj1 = new Child();
        obj1.m1("m1 method with parameter");


    }
}


