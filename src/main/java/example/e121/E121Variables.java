package org.example.e121;



/*
declare 3 instance variables to hold an integer, double and char values.
Create 2 instances of the class and assign values to variables and the print them

**Output:**

```
10
10.23
a
100
100.23
s
 */

public class E121Variables {
    int num1;
    double num2;
    char c;

    void printData(){
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(c);
    }
    public static void main(String[] args) {

        E121Variables obj1=new E121Variables();
        obj1.num1=10;
        obj1.num2=10.23;
        obj1.c='a';
        obj1.printData();

        E121Variables obj2=new E121Variables();
        obj2.num1=100;
        obj2.num2=100.23;
        obj2.c='s';
        obj2.printData();

    }
}
