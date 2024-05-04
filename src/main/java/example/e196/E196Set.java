package org.example.e196;

import java.util.HashSet;
import java.util.Set;

/*
Create a Set and and below values to it.

[third, first, second]

Print HashSet and then remove all the elements from Hashset and print it again.
**Output:**

```
[third, first, second]
[]
 */
public class E196Set {
    public static void main(String[] args) {

        Set<String> set=new HashSet<>();
        set.add("third");
        set.add("first");
        set.add("second");
        System.out.println(set);
        set.clear();
        System.out.println(set);

    }

}
