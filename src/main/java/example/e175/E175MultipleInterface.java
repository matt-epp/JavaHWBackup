package org.example.e175;
/*
Create two interfaces
1. MyFirstInterface - which has un-implemented method  firstMethod()
2. MySecondInterface - which has un-implemented method  secondMethod()

Now, write a class which will implement both the interfaces and print the below output

**Output:**

```
First Method implementing multiple Inheritance
Second Method implementing multiple Inheritance

 */
interface MyFirstInterface{
    void firstMethod();
}
interface MySecondInterface{
    void secondMethod();
}
class Parent implements MyFirstInterface,MySecondInterface{
    @Override
    public void firstMethod() {
        System.out.println("First Method implementing multiple Inheritance");

    }

    @Override
    public void secondMethod() {
        System.out.println("Second Method implementing multiple Inheritance");
    }
}
public class E175MultipleInterface {

    public static void main(String[] args) {

        Parent obj=new Parent();
        obj.firstMethod();
        obj.secondMethod();
    }
}

