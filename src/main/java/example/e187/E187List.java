package org.example.e187;

import java.util.ArrayList;

/*
Create an array list to type String.

Add these values below to your arraylist

hi

yo

sup

yolo

boop

Remove 1, 3, 5 element from an array

print remained values one by one in one line

**Output:**

```
yo yolo
 */
public class E187List {
    public static void main(String[] args){

        ArrayList<String> stringObjects=new ArrayList<>();

        stringObjects.add("hi");
        stringObjects.add("yo");
        stringObjects.add("sup");
        stringObjects.add("yolo");
        stringObjects.add("boop");
        stringObjects.remove(0);
        stringObjects.remove(1);
        stringObjects.remove(2);
        System.out.print(stringObjects.get(0)+" ");
        System.out.print(stringObjects.get(1)+" ");


    }

}
