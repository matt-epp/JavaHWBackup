package org.example.e147;
/*
Create instance variables as below.

model
price,
quantity
Create a constructor that will initialize instance variables.

Create a method with name carStockValue. Write logic to calculate the total values of cars in stock and print the result.

run the application in Main Class

**Output:**

```
Toyota 2019 Stock Value 2500000.0
BMW 2019 Stock Value 652980.0
Assignment Goal. Clean Code, This Keyword, Method Creation, Mathematic Operations.
 */
public class E147ThisKeyword {

    String model;
    double price;
    int quantity;

    E147ThisKeyword(String model,double price,int quantity){
        this.model=model;
        this.price=price;
        this.quantity=quantity;
    }
    void carStockValue(){
        double stockValue=price*quantity;
        System.out.println(model+" Stock Value "+stockValue);
    }

    public static void main(String[] args) {
        E147ThisKeyword obj1=new E147ThisKeyword("Toyota 2019",25000,100);
        obj1.carStockValue();
        E147ThisKeyword obj2=new E147ThisKeyword("BMW 2019",65298,10);
        obj2.carStockValue();

    }
}
