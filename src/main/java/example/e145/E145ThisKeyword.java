package org.example.e145;

public class E145ThisKeyword {

    /*
    Complete the Dog.java class:
Create following class variables.

dogName

dogWeight

static dogBreed=Mutt;

For all methods and variables use proper naming convention.

Create constructor to initialize instance variables

In Main class Create 2 Objets of a Dog class and using each object reference variable print details of objects.

**Output:**

```
Tarzan Mutt 50.0
Lucy Mutt 10.0
     */

    String dogName;

    double dogWeight;

       String dogBreed;

    E145ThisKeyword(String dogName,String dogBreed,double dogWeight){
        this.dogName=dogName;
        this.dogWeight=dogWeight;
        this.dogBreed=dogBreed;
    }
    void printData(){
        System.out.println(dogName+" "+dogBreed+" "+dogWeight);
    }
    public static void main(String[] args) {
    E145ThisKeyword obj1= new E145ThisKeyword("Tarzan","Mutt",50.0);
    E145ThisKeyword obj2= new E145ThisKeyword("Lucy","Mutt",10);
    obj1.printData();
    obj2.printData();
    }
   // Tarzan Mutt 50.0
   // Lucy Mutt 10.0

}
