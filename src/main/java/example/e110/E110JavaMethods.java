package org.example.e110;
/*
Create a method name as newLine that should have print statement inside the method body as "newLine method implementation"
Create a method name as displayLine that should have print statement inside the method body as "displayLine method implementation"
Call both methods

**Output:**

```
newLine method implementation
displayLine method implementation
 */
public class E110JavaMethods {
    void newLine(){
        System.out.println("newLine method implementation");
    }
    void displayLine(){
        System.out.println("displayLine method implementation");
    }
    public static void main(String[] args) {
        E110JavaMethods obj= new E110JavaMethods();
        obj.newLine();
        obj.displayLine();
    }
}
