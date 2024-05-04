package org.example.e146;
/*
Complete the Employee.java class:
Include the following class variables:

name(String)

lastName(String)

employeeId(int)

startDate(String)

salary(int)

Write two constructors:

non-argument constructor

parameterized constructor that will initialize all instance variables

Create two different objects of the Employee class using both constructors and print the values of the properties inline using a print method.



**Output:**

```
null null 0 null 0
Joe Smith 12345 01/01/1970 35000
 */
import org.example.e142.E142Constructor;

public class E146ThisKeyword {
    String name;

    String lastName;

    int employeeId;

    String startDate;

    int salary;

    E146ThisKeyword() {
        System.out.println(name + " " + lastName + " " + employeeId + " " + startDate+ " "+salary);
    }
    E146ThisKeyword(String name,String lastName,int employeeId,String startDate,int salary){
        this.name=name;
        this.lastName=lastName;
        this.employeeId=employeeId;
        this.startDate=startDate;
        this.salary=salary;
    }
    public static void main(String[] args) {
        E146ThisKeyword obj1 = new E146ThisKeyword();


        E146ThisKeyword obj2=new E146ThisKeyword("Joe","Smith",12345,"01/01/1970",35000);
       System.out.println(obj2.name+" "+obj2.lastName+" "+obj2.employeeId+" "+ obj2.startDate+" "+obj2.salary);


    }
}
