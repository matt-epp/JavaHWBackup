package org.example.e125;
/*
Declare a static variable number that will hold an integer value:
Access number from the main method and assign value to it.
Create an Object of the class, access number in a nonstatic way and assing value of 200.
Print out number using class name and using instance

**Output:**

```
200
200
 */

public class E125Variables {

    static int num1;

    E125Variables(int num1) {
        this.num1 = num1;

    }

    public static void main(String[] args) {

       // E125Variables.num1 = 200;

        E125Variables obj1 = new E125Variables(200);
        System.out.println(E125Variables.num1);
        System.out.println(num1);


    }
}
