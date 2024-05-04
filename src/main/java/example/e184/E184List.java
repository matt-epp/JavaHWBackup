package org.example.e184;

import java.util.ArrayList;

/*
Create a array list that will hold Integer Objects:

Add below elements to it.

111

222

333

444

555

666

Print first, third and fifth element from your array

**Output:**

```
111
333
555
 */
public class E184List {
    public static void main(String[] args){

        ArrayList<Integer> integerObjects=new ArrayList<>();
        integerObjects.add(111);
        integerObjects.add(222);
        integerObjects.add(333);
        integerObjects.add(444);
        integerObjects.add(555);
        integerObjects.add(666);
        System.out.println(integerObjects.get(0));
        System.out.println(integerObjects.get(2));
        System.out.println(integerObjects.get(4));

    }

}
