package org.example.e109;
/*
Create method name it as newLine
Add print statement inside method body as "newLine method implementation"
Call newLine method three times

**Output:**

```
newLine method implementation
newLine method implementation
newLine method implementation
 */
public class E109JavaMethods {
    void newLine(){
        System.out.println("newLine method implementation");
    }
    public static void main(String[] args) {
        E109JavaMethods obj=new E109JavaMethods();
        for (int i = 0; i < 3; i++) {
            obj.newLine();

        }

    }

}
