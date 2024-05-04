package org.example.e199;

import java.util.LinkedHashSet;
import java.util.Set;

/*
Create a Set collection in which you want to preserve an order of inserted String Objects.

Add the below values

null

Sohil

Diego

Alijon

Asel

Sumair

Print values 1 by 1 using loop and Iterator
**Output:**

```
null
Sohil
Diego
Alijon
Asel
Sumair
null
Sohil
Diego
Alijon
Asel
Sumair
 */
public class E199Set {
    public static void main(String[] args) {

        Set<String> names= new LinkedHashSet<>();
        names.add("null");
        names.add("Sohil");
        names.add("Diego");
        names.add("Alijon");
        names.add("Asel");
        names.add("Sumair");

        names.forEach(x-> System.out.println(x));
        names.forEach(x-> System.out.println(x));

}

}
