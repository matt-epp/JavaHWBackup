package org.example.e98;
/*
Create a String given="Hello Syntax friends".
Using String methods from given String create new String "Welcome Syntax family"

Expected Output:
```
Welcome Syntax family
 */
public class E98StringManipulations {
    public static void main(String[] args) {


        String given= new String("Hello Syntax friends");
        String newStr=(given.replaceAll("Hello","Welcome").replaceAll("friends","family"));
        System.out.println(newStr);
    }
}

