package org.example.e87;
/*
Create a class named 'Main' with specific attributes.

Create two objects of that class in which you will be assigning the following values and then print them.

carColor='Black'

carYear=2019

carMake='BMW'

carColor='White'

carYear=2018

carMake='Toyota'

**Expected Output:**

```
Car color is Black and car year is 2019 and car model is BMW
Car color is White and car year is 2018 and car model is Toyota
 */
class Main{

    Main (String carColor,int carYear,String carMake){
        System.out.println("Car color is "+carColor+" and car year is "+carYear+" and car model is "+carMake);
    }

}
public class E87ClassAndObject {
    public static void main(String[] args) {

        Main obj1=new Main("Black",2019,"BMW");

        Main obj2=new Main("White",2018,"Toyota");



    }
}
