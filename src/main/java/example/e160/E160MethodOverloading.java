package org.example.e160;
/*
Overload instance method display by having different types of parameters

Inside each method write the logic to print value of the parameter

Call all methods inside your main method

**Output:**

```
100
Syntax Technologies
100.09
 */


public class E160MethodOverloading {

    void display(int a){
        System.out.println(a);
    }
    void display(String name){
        System.out.println(name);
    }
    void display(double b){
        System.out.println(b);
    }
    public static void main(String[] args){

        E160MethodOverloading obj1=new E160MethodOverloading();
        obj1.display(100);
        obj1.display("Syntax Technologies");
        obj1.display(100.09);
    }
}

