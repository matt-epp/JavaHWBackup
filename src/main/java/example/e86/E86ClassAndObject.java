package org.example.e86;
/*
Create a class 'Main' (please do not make it public as Repl will give you an error)

Inside class declare a String variable 'name' and integer variable 'roll_no'.

Create an object of the class and assign the value of 2 to roll_no and value of "John" to name

Your program should print the following:

```
Name is John and roll number is 2
 */
class Main{

    Main (String name,int roll_no){
        System.out.print("Name is "+name+" and roll number is "+roll_no);
    }
}
public class E86ClassAndObject{
    public static void main(String[] args) {

        Main m= new Main("John",2);

    }
}

