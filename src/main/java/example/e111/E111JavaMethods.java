package org.example.e111;
/*
Create one method as syntaxTechnologies and write the logic for that method in println statement as "Welcome to Syntax Technologies!"
Create another method as syntaxStudents and write the logic for that method in println statement as "Welcome Syntax Students!"
Call both methods

**Output:**

```
Welcome to Syntax Technologies!
Welcome Syntax Students!
 */
class E111{
    void syntaxStudents(){
        System.out.println("Welcome Syntax Students!");
    }
    void syntaxTechnologies() {

        System.out.println("Welcome to Syntax Technologies!");
    }
        }
public class E111JavaMethods {
    public static void main(String[] args) {



        E111 obj1=new E111();
        E111 obj2=new E111();
        obj1.syntaxTechnologies();
        obj2.syntaxStudents();



    }
}

