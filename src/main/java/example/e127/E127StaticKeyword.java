package org.example.e127;
/*
Create two methods:
The first method should be a non-static method that will print out the following message:
"Programming is amazing."
The second method should be a static method that will print out the following message:
"Java is awesome."
Execute both methods

**Output:**

```
Programming is amazing.
Java is awesome.
 */

public class E127StaticKeyword {

     void printOut1(){
        System.out.println("Programming is amazing.");
    }
    static void printOut2(){
        System.out.println("Java is awesome.");
    }

    public static void main(String[] args) {
    E127StaticKeyword obj1= new E127StaticKeyword();

        obj1.printOut1();
        printOut2();




    }
}