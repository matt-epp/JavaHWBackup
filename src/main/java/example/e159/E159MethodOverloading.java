package org.example.e159;
/*
Create 3 overloaded methods to perform subtraction of 2, 3 and 4 numbers

In main method execute all 3 methods to match the output:

**Output:**

```
40 (should come from subtracting 4 numbers)
30 (should come from subtracting 3 numbers)
20 (should come from subtracting 2 numbers)
 */

public class E159MethodOverloading {
    void subtraction(int a,int b,int c,int d){
        System.out.println(a-b-c-d+" (should come from subtracting 4 numbers)");

    }
    void subtraction(int a,int b,int c){
        System.out.println(a-b-c+" (should come from subtracting 3 numbers)");

    }

    void subtraction(int a,int b){
        System.out.println(a-b+" (should come from subtracting 2 numbers)");

    }

    public static void main(String[] args) {
        E159MethodOverloading obj1=new E159MethodOverloading();

        obj1.subtraction(80,20,10,10);
        obj1.subtraction(60,10,20);
        obj1.subtraction(30,10);
    }

}

