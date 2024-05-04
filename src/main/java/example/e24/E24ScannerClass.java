package org.example.e24;

import java.util.Scanner;

/*
Write a program that takes a user's name and prints it.

**Output:**

```
Hello, please enter your name
Your name is Sumair
 */
public class E24ScannerClass {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Hello, please enter your name");
        String name= scan.nextLine();
        System.out.println("Your name is "+name);

    }
}
