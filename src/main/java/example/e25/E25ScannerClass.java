package org.example.e25;
/*
The variable "num" holds an integer input from a user
Write a conditional statement starting on line 9 that does the following:
If num is positive, print "__ is positive"
If num is negative, print "__ is negative"
If num is equals to 0, then print "Entered number is equals to 0"

**Output:**

```
Examples:
In: 5
5 is positive
In: -2
-2 is negative
In: 0
Entered number is equals to 0xxwe4
 */

import java.util.Scanner;

public class E25ScannerClass {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("In:");
        int num = inp.nextInt();
        //DO NOT CHANGE ABOVE CODE!  Write your code below
        if (num > 0) {
            System.out.println(+num + " is positive");
        } else if(num < 0){
            System.out.println(+num + " is negative");
        }else{
            System.out.println("Entered number is equals to 0");
        }
    }
}