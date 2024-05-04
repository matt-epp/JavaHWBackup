package org.example.e115;
/*
Create a method that will accept a String as a parameter and return new String all in upper case
Call method
**Output:**

```
TEST
 */
class E115{
    String str;
    String upperCase(String str){
        String allCaps =str.toUpperCase();

        return allCaps;
    }

}
public class E115JavaMethods {
    public static void main(String[] args) {

        E115 obj1=new E115();
        String result=obj1.upperCase("test");
        System.out.println(result);

    }
}
