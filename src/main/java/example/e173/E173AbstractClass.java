package org.example.e173;
/*
Create a Super Class Tea that will have:

- instance variable teaType;
- constructor that will initialize
- unimplemented method addSugar(),

Create 2 subclasses of Tea as Lemon Tea and Chai Tea.

In main class create an object of 2 Child and assign them to Parent reference type.

Execute method addSugar from both classes.

**Output:**

```
For Lemon Tea we need 2 spoons of sugar
For Chai Tea we need 1 spoon of sugar
 */
class Tea{

    String teaType;

    Tea(){

    }
    void addSugar(){

    }
}
class LemonTea extends Tea{

    @Override
    void addSugar() {
        super.addSugar();
        System.out.println("For Lemon Tea we need 2 spoons of sugar");
    }
}

class ChaiTea extends Tea{
    @Override
    void addSugar() {
        super.addSugar();
        System.out.println("For Chai Tea we need 1 spoon of sugar");
    }
}
public class E173AbstractClass {
    public static void main(String[] args) {

        LemonTea obj= new LemonTea();
        obj.addSugar();
        ChaiTea obj2=new ChaiTea();
        obj2.addSugar();

    }

    }



