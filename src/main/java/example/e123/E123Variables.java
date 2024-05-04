package org.example.e123;
/*
Declare the instance variables to hold:
integer values
String values
double values
boolean values
float values
Access instance variables and then print them all without assigning any values to them.
Print variables one by one the same sequence that you declare them.


**Output:**

```
0
null
0.0
false
0.0
 */

public class E123Variables {
    static int num1;
    static String str;
    static double num2;
    static boolean x;
    static float y;

    static void dataPrint(){
        System.out.println(num1);
        System.out.println(str);
        System.out.println(num2);
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {

        E123Variables.dataPrint();
        ;
    }
}
