package org.example.e113;
/*
Step1: Create a method that will accept with 2 parameters of integer type
Step2: Write the logic in that method in println statement to print hours and minutes
Step3: Call the method

**Output:**

```
11:30
 */
class E113{
    int hours;
    int minutes;
    void hoursMinutes(int hours,int minutes){
        System.out.println(hours+":"+minutes);
    }
}
public class E113JavaMethods {
    public static void main(String[] args) {

        E113 obj1=new E113();
        obj1.hoursMinutes(11,30);
    }
}

