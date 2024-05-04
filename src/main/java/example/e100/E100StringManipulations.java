package org.example.e100;

import java.util.Scanner;

/*
Given the following inputs:
String s;
Write a for loop that will print out the reverse of the string.
Sample input/outputs:
```
In: manhattan
nattahnam
In: processor
rossecorp
In: racecar~~
racecar
```
 */
public class E100StringManipulations {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       // String[] word= new String[]{scan.next()};
      String str= scan.next();
        System.out.print("In:");
        for (int i = str.length()-1; i >=0; i--) {
            System.out.print(str.charAt(i));

          //  String str="Sunday";

           // for (int i = str.length()-1; i >=0 ; i--) {
              //  System.out.print(str.charAt(i));

        }
        System.out.println();

    }
}
