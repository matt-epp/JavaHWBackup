package org.example.e149;
/*
Create Three classes (Main, A, B):
Have a method that prints out the following

For A: "Class A"

For B: "Class B"

Make B extend A

From your Main class create an object of the B class and call the methods.


**Output:**

```
Class A

Class B
```
 */
class Main{


}

class A extends Main{
    void printInfo(){
        System.out.println("Class A");
    }


}
class B extends A{
    void printInfo(){
        System.out.println("Class B");
    }

}
public class E149Inheritance {





        public static void main (String[]args){
            A obj2=new A();
            obj2.printInfo();
          B obj1=new B();
            obj1.printInfo();


    }

    }