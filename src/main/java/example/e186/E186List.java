package org.example.e186;
/*
Create an Arraylist of type Integer.

Add below elements to it.

111

222

333

444

555

666

Print the ArrayList.

remove all the elements.

Print the Arraylist.

**Output:**

```
[111, 222, 333, 444, 555, 666]
[]
 */

import java.util.ArrayList;

public class E186List {
    public static void main(String[] args){

        ArrayList<Integer> integerObjects=new ArrayList<>();
        integerObjects.add(111);
        integerObjects.add(222);
        integerObjects.add(333);
        integerObjects.add(444);
        integerObjects.add(555);
        integerObjects.add(666);
        System.out.println(integerObjects);
        integerObjects.clear();
        System.out.println(integerObjects);

    }

}
