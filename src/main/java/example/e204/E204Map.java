package org.example.e204;

import java.util.LinkedHashMap;
import java.util.Map;

public class E204Map {
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
