package org.example.e185;

import java.util.ArrayList;

/*
Create an arrayList of type Integer.

add below values.

111

111

111

999

999

999

Print all the values of List 1 by 1:

**Output:**

```
111
111
111
999
999
999
 */
public class E185List {
    public static void main(String[] args){

        ArrayList<Integer> integerObjects=new ArrayList<>();
        integerObjects.add(111);
        integerObjects.add(111);
        integerObjects.add(111);
        integerObjects.add(999);
        integerObjects.add(999);
        integerObjects.add(999);
        System.out.println(integerObjects.get(0));
        System.out.println(integerObjects.get(1));
        System.out.println(integerObjects.get(2));
        System.out.println(integerObjects.get(3));
        System.out.println(integerObjects.get(4));
        System.out.println(integerObjects.get(5));

    }

}
