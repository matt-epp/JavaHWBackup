package org.example.e191;

import java.util.ArrayList;

/*
Create an ArrayList of type boolean called listA and add below values

(true, false, false)
Create another array list call listB and ad all values from List A into it

Using iterator print all values from ListB 1 by 1


**Output:**

```
true
false
false
 */
public class E191List {
    public static void main(String[] args){

        ArrayList<Boolean> listA=new ArrayList<>();
        listA.add(true);
        listA.add(false);
        listA.add(false);

        ArrayList<Boolean> listB=new ArrayList<>();
        listB.add(true);
        listB.add(false);
        listB.add(false);

        listB.forEach(x-> System.out.println(x));

        }
    }
