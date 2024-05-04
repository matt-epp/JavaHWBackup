package org.example.e200;

/*
Create A Map that will preserve an order of entry objects

Add below pairs :

"Street" = "Patrick ST"

"Suite" = "265"

"City" = "Vienna"

"Zip" = "22180"

"Country" = "United State"

Print all values of from the map

**Output:**

```
Patrick ST
265
Vienna
22180
United State
 */

import java.util.LinkedHashMap;
import java.util.Map;

public class E200Map {
    public static void main(String[] args) {

        Map<String,String> address=new LinkedHashMap();
        address.put("Street","Patrick ST");
        address.put("Suite","265");
        address.put("City","Vienna");
        address.put("Zip","22180");
        address.put("Country","United State");

        address.forEach((k,v)-> System.out.println(v));



    }
}
