package org.example.e168;
/*
Create an instance final method that will reverse a String and return that new String

Call method from the main method


**Output:**

```
olleh
 */

public class E168FinalKeyword {

    final String  reverse(String word){
        StringBuilder rev=new StringBuilder(word);

        return rev.reverse().toString();



    }




    public static void main(String[] args){
        E168FinalKeyword obj1=new E168FinalKeyword();
        System.out.println(obj1.reverse("hello"));

    }
}


