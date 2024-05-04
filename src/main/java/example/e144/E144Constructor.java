package org.example.e144;

import org.example.e142.E142Constructor;

import java.awt.print.Paper;

/*
Step 1: Complete the StoreProduct.java class:

Create below instance variables. (Choose proper datatype and naming convention for variable )

label

price

category

hasExpiration

stock (represent the stock quantity)

Step 2: Write three constructors:

The main constructor( with all parameters)

Second constructor with all parameters except category and hasExpiration (category defaults to "misc", hasExpiration defaults to false inside constructor)

Third constructor all the parameters except category, expiration, and stock (stock default to 0 inside the constructor)

Step 3: Method for display out put.

in StoreProduct Class create a method to display the output of class variables. (Output sequence as as order of variable shown above. all in one line)

Step 4: in Main Class Create an object of StoreProduct Class with each constructors.

pass the values and then call the display method.

Step 5: Execute your application :)

Hint: each variable must be object specific

**Output:**

```
Eggs 3.0 Produce true 10
Paper Towels 2.0 misc false 24
Paper Towels 2.0 null false 0
 */
public class E144Constructor {

    String label;
    double price;
    String category;
    Boolean hasExpiration;
    int stock;

    E144Constructor(String label,double price,String category,Boolean hasExpiration,int stock){
        this.label=label;
        this.price=price;
        this.category=category;
        this.hasExpiration=hasExpiration;
        this.stock=stock;
    }

    E144Constructor(String label,double price,int stock){
        this.label = label;
        this.price = price;
        this.category = "misc";
        this.hasExpiration = false;
        this.stock = stock;
    }
    E144Constructor(String label,double price){
        this.label=label;
        this.price=price;
        this.category=null;
        this.hasExpiration=false;
        this.stock=0;
    }
    void printData(){
        System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
    }

    /*Eggs 3.0 Produce true 10
    Paper Towels 2.0 misc false 24
    Paper Towels 2.0 null false 0
*/



    public static void main(String[] args) {
        E144Constructor obj1=new E144Constructor("Eggs",3.0,"Produce",true,10);
        obj1.printData();
        E144Constructor obj2=new E144Constructor("Paper Towels",2.0,24);
        obj2.printData();
        E144Constructor obj3=new E144Constructor("Paper Towels",2.0);
        obj3.printData();

    }
}
