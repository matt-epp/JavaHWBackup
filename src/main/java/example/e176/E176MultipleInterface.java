package org.example.e176;
/*
Create two interfaces

1. ParentInterface - which has un-implemented method  parentMethod()
2. ChildInterface - which has un-implemented method  childMethod ()
   and also ChildInterface inherits the ParentInterface


Now, write a class which will implement  the ChildInterface and print the below output

**Output:**

```
Parent Method-welcome to Syntax
Child Method-hello Syntax
 */
interface ParentInterface{
    void parentMethod();
}
interface ChildInterface extends ParentInterface{
    void childMethod();
}
class Child implements ChildInterface{
    @Override
    public void parentMethod() {
        System.out.println("Parent Method-welcome to Syntax");
    }

    @Override
    public void childMethod() {
        System.out.println("Child Method-hello Syntax");
    }
}
public class E176MultipleInterface {

    public static void main(String[] args){

        Child obj=new Child();
        obj.parentMethod();
        obj.childMethod();
    }
}


