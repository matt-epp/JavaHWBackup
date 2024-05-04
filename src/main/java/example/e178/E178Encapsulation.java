package org.example.e178;



/*
Create Class EncapsulationDemo

create two variable as shown below.

private String empName;

private int empAge;

Create the getter/setter methods for each variable.

In Main Class and main method.

Using setter methods assign the values as "John" and "30"

Using getter methods print the values as below outputs.
**Output:**

```
Employee Name: John

Employee Age: 30
 */
class EncapsulationDemo{
    private String empName;

    private int empAge;

    EncapsulationDemo(String empName,int empAge){
        this.empName=empName;
        this.empAge=empAge;

    }

   public void getName(){
       System.out.println("Employee Name: "+empName);

    }
    public void getAge(){
        System.out.println("Employee Age: "+empAge);

    }
    public void setName (String empName){
       this.empName=empName;

    }
    public void setAge(int empAge){
        this.empAge=empAge;

    }
}
public class E178Encapsulation {
    public static void main(String[] args){

EncapsulationDemo obj= new EncapsulationDemo("John",30);
obj.getName();
obj.getAge();

    }
}
