package org.example.e34;

import java.util.Scanner;
/*
Write a program to find the largest number among three distinct numbers using nested if condition

Please use Scanner class to take input from users


**Expected Input:**
```
Please enter 3 distinct numbers 4 5  and 14
```
**Expected Output:**
```
The largest number is 14
 */
public class E34NestedIfAndScanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int num3=scan.nextInt();
        if(num1>num2){
            if(num1>num3){
                System.out.println("The largest number is "+num1);
            }else {
                System.out.println("The largest number is "+num3);
            }
        }else {
            if(num2>num3){
                System.out.println("The largest number is "+num2);

            }else {
                System.out.println("The largest number is "+num3);

            }
        }
    }
}
