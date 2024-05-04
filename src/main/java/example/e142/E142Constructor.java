package org.example.e142;

import java.io.OutputStream;

/*
Complete the SyntaxTechnologies class:

Include the following class variables:

schoolName(String)

batch(int)

year(int)

lastDayOfClass(String)

Write two constructors:

non-argument constructor

parameterized constructor

Create method to display values of instance variables.

2. In Main Class:

Create two different objects of the SyntaxTechnologies class using both constructors and call display method.

**Output:**

```
null 0 0 null

Syntax 6 2020 07/30/2020
 */
public class E142Constructor {
    String schoolName;

    int batch;

    int year;

    String lastDayOfClass;

    E142Constructor() {
        System.out.println(schoolName + " " + batch + " " + year + " " + lastDayOfClass);
    }
    E142Constructor(String schoolName,int batch,int year,String lastDayOfClass){
        this.schoolName=schoolName;
        this.batch=batch;
        this.year=year;
        this.lastDayOfClass=lastDayOfClass;
     }
     void printInfo(){
         System.out.println(schoolName+" "+batch+" "+year+" "+ lastDayOfClass);
     }

    public static void main(String[] args) {

        E142Constructor obj1 = new E142Constructor();


        E142Constructor obj2=new E142Constructor("Syntax",6,2020,"07/30/2020");
        obj2.printInfo();

    }
}


