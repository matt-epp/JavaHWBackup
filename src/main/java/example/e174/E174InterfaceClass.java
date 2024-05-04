package org.example.e174;
/*
Create an Interface  MyInterface which has two un-implemented method - m1 & m2

Now , create a Class which will implement the MyInterface .

We are expecting the output as below

**Output:**

```
implementation of method1

implementation of method2
 */
interface myInterface{

    void m1();
    void m2();


}
class Child{

    static void m1(){
        System.out.println("implementation of method1");
    }

   static void m2(){
        System.out.println("implementation of method2");
    }
}
public class E174InterfaceClass{

    public static void main(String[] args) {

        Child.m1();
        Child.m2();
    }

}