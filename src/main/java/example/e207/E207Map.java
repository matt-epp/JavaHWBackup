package org.example.e207;
/*
Create Hash Map.

add the follow values

map.put("ONE","AAA");

map.put("TWO","BBB");

map.put("THREE","CCC");

map.put("FOUR","DDD");

map.put("FIVE","EEE");

Using EntrySet print the key and values pairs using iterator only

replace with below key THREE--> ASEL and key FIVE-->SUMAIR

Using EntrySet print the key and values pairs using iterator only

**Output:**

```
HashMap Before Replace :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Replace :
FIVE : SUMAIR
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : ASEL
 */


import java.util.HashMap;
import java.util.Map;

public class E207Map {

    public static void main(String[] args) {

        Map<String,String> map= new HashMap<>();

        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");
        System.out.println("HashMap Before Replace :");
        map.entrySet().forEach(x-> System.out.println(x.getKey()+" : "+x.getValue()));
        map.replace("THREE","ASEL");
        map.replace("FIVE","SUMAIR");
        System.out.println("------------------");
        System.out.println("HashMap After Replace :");
        map.entrySet().forEach(x-> System.out.println(x.getKey()+" : "+x.getValue()));

    }
}

