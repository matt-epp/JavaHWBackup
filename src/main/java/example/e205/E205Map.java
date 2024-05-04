package org.example.e205;
/*
Create a HashMap of String.

Add below pair to it .

"Street" = "Patrick ST"

"Suite" = "265"

"City" = "Vienna"

"Zip" = "22180"

"Country" = "United State"

Print all the values in upper case using entrySet


**Output:**

```
265
22180
PATRICK ST
UNITED STATE
VIENNA
 */


import java.util.LinkedHashMap;
import java.util.Map;

public class E205Map {

    public static void main(String[] args) {
        Map<String,String> address=new LinkedHashMap();
        address.put("Street","Patrick ST");
        address.put("Suite","265");
        address.put("City","Vienna");
        address.put("Zip","22180");
        address.put("Country","United State");


        address.entrySet().forEach(x-> System.out.println(x.getValue().toUpperCase()));
        }





}
