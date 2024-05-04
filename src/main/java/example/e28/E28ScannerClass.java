package org.example.e28;

import java.util.Scanner;

/*
Write a program to take values of length and width from the user.
Based on value define whether the shape is a square or rectangle.


**Output:**

```
Examples:
Please enter the length 18
Please enter the width 16
The shape of your object is rectangle

Please enter the length 16
Please enter the width 16
The shape of your object is square
 */
public class E28ScannerClass {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the length");
        int length = scan.nextInt();
        System.out.println("Please enter the width");
        int width = scan.nextInt();

        if(length==width){
            System.out.println("The shape of your object is square");
        }else{
            System.out.println("The shape of your object is rectangle");
        }

    }
}
