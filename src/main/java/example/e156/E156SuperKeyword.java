package org.example.e156;
/*
Create class A

declare variable int i=10;

Create class B extends A

declare variable int i=20;

create a method to display value of variable i from both classes

In Main Class create an object of subclass and call method display

**Output:**

```
20
10
 */
class A{
    int i=10;
    void printInfo(){
        System.out.println(i);
    }

}
class B extends A{
    int i=20;
    void printInfo(){
        System.out.println(i);
    }
}
public class E156SuperKeyword {
    public static void main(String[] args) {
   B obj1=new B();
   obj1.printInfo();
   A obj2=new A();
   obj2.printInfo();

}
}
