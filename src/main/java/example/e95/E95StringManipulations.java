package org.example.e95;

/*
Using Scanner class input string value.

Print out the following: "The first 3 letters of \_\_\_ is ___"

```
For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".
 */

import java.util.Scanner;

public class E95StringManipulations {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String word=scan.next();
        System.out.println("The first 3 letters of "+word+" is "+word.substring(0,3));

    }
}
