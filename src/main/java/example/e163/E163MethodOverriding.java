package org.example.e163;
/*
In Parent Class create a method with name method() that will print "Parent method"

Override method() in Child class that will print "Child method"

In Main Class create objects of child and parent class and call its method.


**Output:**

```
Parent method
Child method
 */
class Parent{
    void method(){
        System.out.println("Parent method");
    }
}
class Child extends Parent{
    void method(){
        System.out.println("Child method");
    }
}
public class E163MethodOverriding {
    public static void main(String[] args) {
Parent p=new Parent();
p.method();
Child c=new Child();
c.method();
    }
}
