package org.example.e148;
/*
Create variables as below.

item,
price,
quantity
Create a constructor to initialize instance variables.

Create a method with name itemTotalPrice.

write a logic to to calculate the total values of items in stock. and print the result.

return the total value.

In Main Class.

Create two Object of ShoppingStore and pass the parameters to Constructor.

then using each object call the method itemTotalPrice.

Store the returned value of each object.

Calculate sum of both object and print the result.
**Output:**

```
Blanket Total Value 99.98
Mattress Total Value 439.18
You purchased 539.16 Today
 */
public class E148ThisKeyword {

    String item;
    double price;

    int quantity;

    E148ThisKeyword(String item, double price, int quantity){
        this.item=item;
        this.price=price;
        this.quantity=quantity;
    }

        double itemTotalPrice(){
        double total=quantity*price;
            System.out.println(item+ " Total Value "+ total);
        return total;
        }
    public static void main(String[] args){

        E148ThisKeyword obj1=new E148ThisKeyword("Blanket",49.99,2);
        double result1=obj1.itemTotalPrice();

        E148ThisKeyword obj2=new E148ThisKeyword("Mattress",219.59,2);
        double result2=obj2.itemTotalPrice();
        System.out.println("You purchased "+(result2+result1)+" Today");
    }
}
   /*
   Blanket Total Value 99.98
Mattress Total Value 439.18
You purchased 539.16 Today
    */