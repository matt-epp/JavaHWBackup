package org.example.e162;
/*
Overload static method and then execute both overloaded methods.


**Output:**

```
static method without parameter
static method with int parameter
 */


import org.example.e161.E161MethodOverloading;

public class E162MethodOverloading {

    static void m1() {

        System.out.println("static method without parameter");
    }

    static void m1(int a) {
        System.out.println("static method with int parameter");
    }


            public static void main (String[]args){


                m1();
                m1(10);
        }
        }


