package org.example.e180;
/*
Create Class EncapsulationDemo

create two variable as shown below.

private String empName=John;

private int empAge=30;

Create only getters methods for each variable.

Print the values of each variable as shown below.

**Output:**

```
Employee Name: John

Employee Age: 30
 */

class EncapsulationDemo {
    private String empName = "John";

    private int empAge = 30;



    public void getName() {
        System.out.println("Employee Name: " + empName);

    }

    public void getAge() {
        System.out.print("Employee Age: " + empAge);


    }
}
public class E180Encapsulation {
    public static void main(String[] args){

        EncapsulationDemo obj= new EncapsulationDemo();
        obj.getName();
        obj.getAge();
    }
}



