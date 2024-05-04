package org.example.e189;

import java.util.LinkedList;
import java.util.List;

/*
  Create a Linked List that will store Integer Objects from 50-100.

Once Linked List is created remove all numbers that are not divisible by 3.

Print Linked List

**Output:**

```
[51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99]
 */
public class E189List {

    public static void main(String[] args) {
        List<Integer> intObjects = new LinkedList<>();
        for (int i = 50; i <= 100; i++) {
            intObjects.add(i);
        }
        // intObjects.forEach(x-> x % 3==0);
        intObjects.removeIf(x -> x % 3 != 0);

        System.out.println(intObjects);

    }
}
