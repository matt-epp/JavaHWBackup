package org.example.e150;
/*
Create four classes (Person, Employee, Student, Retiree)
Have properties
For Person: name(String)

For Person: lastName(String)

For Person: age(int)

For Employee: salary(int)

For Student: grade(int)

For Retiree: seniorActivity(String)

At Employee, Student, Retiree Class have a print method in each that prints the properties in line as shown in the output

Create multilevel inheritance: Person --> Employee --> Student --> Retiree

From your Main class create objects of the Employee, Student and Retiree classes and call the print method.
**Output:**

```
Joe Smith 35 35000
Adam Smith 15 10
Frank Smith 15 tour
```
 */
class Person{
    String name="Joe";
    String lastName="Smith";
    int age=35;



}
class Employee extends Person{


    int salary=35000;
    void printInfo(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }

}
class Student extends Person{
String name="Adam";
    int age=15;
    int grade=10;
    void printInfo(){
        System.out.println(name+" "+lastName+" "+age+" "+grade);
    }

}
class Retiree extends Student{
    String name="Frank";
    String seniorActivity="tour";
    void printInfo(){
        System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
    }

}
public class E150Inheritance {
    public static void main(String[] args) {
Employee obj1=new Employee();
obj1.printInfo();
Student obj2=new Student();
obj2.printInfo();
Retiree obj3=new Retiree();
obj3.printInfo();
    }

}
