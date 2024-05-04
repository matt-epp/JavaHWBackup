package org.example.e179;
/*
Create Class EncapsulationDemo that will have 2 variables empName and empAge; Create the getter/setter methods for each variable.

In Main Class and main method

Using setter methods assign the values as "Mario" and "32"

Using getter methods print the values as below outputs.

**Output:**

```
Employee Name: Mario
Employee Age: 32
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
public class E179Encapsulation {
    public static void main(String[] args) {
        EncapsulationDemo obj= new EncapsulationDemo("Mario",32);
        obj.getName();
        obj.getAge();

    }
}





