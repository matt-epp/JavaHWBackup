package org.example.e183;
/*
Create an array list that will hold String Objects

Find out wether array list is empty or not.

Add String value "Syntax" to it

Find out wether array list is empty or not.

**Output:**

```
true
false
```
 */

import java.util.ArrayList;

public class E183List {
    public static void main(String[] args){

        ArrayList<String> stringObjects=new ArrayList<>();
        System.out.println(stringObjects.isEmpty());
        stringObjects.add("Syntax");
        System.out.println(stringObjects.isEmpty());



    }

}
