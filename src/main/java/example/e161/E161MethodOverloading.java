package org.example.e161;
/*
Overload private instance method m1

Call each method from the main method


**Output:**

```
private m1 method
private m1 method with int parameter
```
 */
public class E161MethodOverloading {

    private void m1(){

        System.out.println("private m1 method ");
    }
    private void m1(int a){
        System.out.println("private m1 method with int parameter");

    }
    public static void main(String[] args) {

        E161MethodOverloading obj1=new E161MethodOverloading();
        obj1.m1();
        obj1.m1(10);

    }
}


