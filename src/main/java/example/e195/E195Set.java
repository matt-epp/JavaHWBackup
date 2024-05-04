package org.example.e195;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
Create the HashSet with list of Integers add the below numbers for the list

111

111

111

999

999

999

Print elements one by one.
**Output:**

```
999
111
 */
public class E195Set {
    public static void main(String[] args) {

        Set<Integer> list=new HashSet<>();
        list.add(111);
        list.add(111);
        list.add(111);
        list.add(999);
        list.add(999);
        list.add(999);

        list.forEach(x-> System.out.println(x));
}
}

