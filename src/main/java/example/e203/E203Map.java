package org.example.e203;
/*
Create HashMap

add values as below

map.put("mango", 10);

map.put("apple", 30);

map.put("orange", 20);

map.put("mango", 40);

map.put("mango", 40);

Using iterator retrieve all keys and values if the format below:


**Output:**

```
Key = orange and value = 20
Key = apple and value = 30
Key = mango and value = 40
 */

import java.util.HashMap;
import java.util.Map;

public class E203Map {

    public static void main(String[] args) {

        Map<String,Integer> map=new HashMap<>();

        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        map.put("mango", 40);
        map.put("mango", 40);

        map.forEach((k,v)-> System.out.println("Key = "+k+" and value = "+v));

    }

}
