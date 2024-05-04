package org.example.e128;
/*
Create a static method with the following specification

Return Type: String
Method Name: mixString
Parameters:
a String called s1
a String called s2
Then inside method write logic that will return the strings combined, one letter at a time, starting with s1. See example below for an example.

```
NOTE: s1 and s2 should be of equal lengths:
s1 ==> "12345"
s1 ==> "12345"
s2 ==> "abcde"
s2 ==> "abcde"
mixString(s1,s2) ==> "1a2b3c4d5e"
 */
public class E128StaticKeyword {
String s1;
String s2;
//00,10,01,11
    static void mixString(String s1, String s2){
        String [] arr1=s1.split("[.]");
        String [] arr2=s2.split("[.]");
        String[][] arr3={arr1,arr2};

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[j][i]);
            }


        }

    }

    public static void main(String[] args) {
E128StaticKeyword obj1= new E128StaticKeyword();
            obj1.mixString("12345","abcde");
    }

}