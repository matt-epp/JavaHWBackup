package org.example.e165;
/*
Parent class create 4 methods with different level of access modifiers. In each method print "I am parent public/protected/default/private method".

Override methods in child class

In Main Class create object of the child class and see which methods are available


**Output:**

```
I am a child public method
I am a child protected method
I am a child default method
```
 */
class Parent{
    public void m1(){
        System.out.println("I am parent public method");
    }
    protected void m2(){
        System.out.println("I am parent protected method");
    }
     void m3(){
        System.out.println("I am parent default method");
    }
    private void m4(){
        System.out.println("I am parent private method");
    }
}
class Child extends Parent{
    public void m1(){
        System.out.println("I am a child public method");
    }
    protected void m2(){
        System.out.println("I am a child protected method");
    }
    void m3(){
        System.out.println("I am a child default method");
    }
    private void m4(){
        System.out.println("I am a child private method");
    }

}
public class E165MethodOverriding {
    public static void main(String[] args) {

        Child obj1=new Child();
        obj1.m1();
        obj1.m2();
        obj1.m3();
    }
}
