package org.example.e124;
/*
Declare static variable in class level as below and assign its value:
String ss="Welcome To Syntax Technologies"
Access variable in the main method and print it using three ways you learned so far
Hint:
first way: By calling directly
Second way: By using the className
Third way: By creating the object of the class


**Output:**

```
Welcome To Syntax Technologies
Welcome To Syntax Technologies
Welcome To Syntax Technologies
 */

public class E124Variables {
    static String ss="Welcome To Syntax Technologies";

    void dataPrint(){
        System.out.println(ss);
    }
    public static void main(String[] args) {
        System.out.println(E124Variables.ss);
        System.out.println(ss);
       // System.out.println(E124);
        E124Variables obj1 = new E124Variables();
        obj1.dataPrint();

    }
}
