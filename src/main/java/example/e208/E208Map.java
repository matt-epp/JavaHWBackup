package org.example.e208;
/*
HashMap, Methods, reusability, Logic
Create a Method in Main class using below specification.

Method Name: display.
Return Type: Void
Parameters : Map<String,Integer>
Logic:
First the method will check the given map is empty or not.
If the map is not empty print pairs of key and value using loops
If map is empty simply print "map is empty"
NOW IN MAIN METHOD
Create HashMap of String keys and Integer values
add values as below
map.put("mango", 10);
map.put("apple", 30);
map.put("orange", 20);
call above method with these arguments.
then clear the map.
and call above method again.
**Output:**
```
orange : 20
apple : 30
mango : 10
map is empty
 */


import java.util.HashMap;
import java.util.Map;

public class E208Map {

    static void display (Map<String,Integer> map){
        if(!map.isEmpty()){
            map.entrySet().forEach(x-> System.out.println(x.getKey()+" : "+x.getValue()));
        } else{
            System.out.println("map is empty");
        }


    }
    public static void main(String[] args) {

        Map<String,Integer> map =new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);

        E208Map.display(map);
        map.clear();
        E208Map.display(map);



    }

}
