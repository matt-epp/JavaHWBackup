package org.example.e170;
/*
Overload 2 final instance methods:

Call them in main method

**Output:**

```
Final method with boolean parameter
Final method with String parameter
 */
public class E170FinalKeyword {
 final void m1(boolean b){
     System.out.println("Final method with boolean parameter");
 }
    final void m1(String str){
        System.out.println("Final method with String parameter");
    }

    public static void main(String[] args){
E170FinalKeyword obj1=new E170FinalKeyword();
obj1.m1(true);
obj1.m1("Cool");
    }

}
