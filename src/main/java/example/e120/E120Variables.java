package org.example.e120;
/*
Declare 3 instance variables to hold:
year, school name and batch #
Access variables from the main method and assign specific values to them
Print values of your variables in the following format

**Output:**

```
I am a student of batch 6 studying at Syntax in the year of 2020
 */
class E120{
    int year;
    String schoolName;
    int batchNum;

    void dataPrint(){
        System.out.println("I am a student of batch "+batchNum+ " studying at "+schoolName+" in the year of "+year);
    }
}
public class E120Variables {


    public static void main(String[] args) {

        E120 obj1=new E120();
        obj1.batchNum=6;
        obj1.schoolName="Syntax";
        obj1.year=2020;

        obj1.dataPrint();



    }
}