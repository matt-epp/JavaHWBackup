package org.example.e137;
/*
In main class please declared the variables using different access modifiers that will hold value for:

- name
- city
- name of the school
- batch number

Create a method to display details in following format:

My name is \_\_\_ and I live in \_\__. I study at \_\_\_ in batch \_\_\_

Assign values to the variables and execute method display

**Expected Output:**
```
My name is John and I live in Miami. I study at Syntax in batch 9
 */
public class E137AccessModifiers {

    String name;
    String city;
    String schoolName;
    static int batchNumber;

     void printData(){
         System.out.println("My name is "+name+" and I live in "+city+". I study at "+schoolName+" in batch "+batchNumber);
    }
    public static void main(String[] args) {
        //My name is John and I live in Miami. I study at Syntax in batch 9
                E137AccessModifiers obj1=new E137AccessModifiers();
                obj1.name="John";
                obj1.schoolName="Syntax";
                obj1.city="Miami";
                obj1.batchNumber=9;
                obj1.printData();

    }
}

