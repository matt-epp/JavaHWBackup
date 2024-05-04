package org.example.e21;

import java.util.Scanner;

//**For you to do:**
//
//Write a program that asks the user's age: "Enter your age "
//Then display it by adding 10 (i.e age + 10) in your final output.
//
//**Output:**
//
//```
//Enter your age 30
//Your age after 10 years is 40
public class E21ScannerClass {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your age ");
        int result= scan.nextInt()+10;
        System.out.println("Your age after 10 years is "+result);


        }
    }

