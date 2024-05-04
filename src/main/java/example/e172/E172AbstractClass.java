package org.example.e172;
/*
Create a Parent Class in which you will have 1 implemented method m2 and 1 unimplemented method m1

Make Main class to be a derived class from Parent.

In main method execute both methods

**Output:**

```
Child class providing implementation
Parent class providing implementation
 */
abstract class Parent{

    abstract void m1();
    static void m2(){
        System.out.println("Parent class providing implementation");
    }
}
class Child{
    void m1(){
        System.out.println("Child class providing implementation");
    }
}
public class E172AbstractClass  {
    public static void main(String[] args){

        Child obj=new Child();
        obj.m1();
        Parent.m2();


    }


}





