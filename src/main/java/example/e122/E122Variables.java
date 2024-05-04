package org.example.e122;
/*
Declare 3 instance variables to hold:
name of the country
capital
population size
Create a method to display values of instance variables
Create 2 Object, assign values to instance variables, execute method display;


**Output:**

```
The capital of USA is Washington DC and population is 330000000
The capital of Kazakhstan is Astana and population is 18500000
 */

public class E122Variables {

    String countryName;
    String countryCapital;
    int population;

    void dataPrint(){

        System.out.println("The capital of "+countryName+" is "+countryCapital+" and population is "+population);
    }
    public static void main(String[] args) {

        E122Variables obj1= new E122Variables();
        obj1.population=330000000;
        obj1.countryCapital="Washington DC";
        obj1.countryName="USA";
        obj1.dataPrint();

        E122Variables obj2= new E122Variables();
        obj2.population=18500000;
        obj2.countryCapital="Astana";
        obj2.countryName="Kazakhstan";
        obj2.dataPrint();

    }
}
