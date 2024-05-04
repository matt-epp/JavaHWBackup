package org.example.e30;


import java.util.Scanner;
/*
Write a program to take the month number from a user.
Provide month name to the corresponding month number
If a user provides any number that is out of month range, the program should display "Invalid"
IMPORTANT: use Scanner Class
 */

public class E30ScannerClass {
    public static void main(String[] args) {
        Scanner month = new Scanner(System.in);
        //DO NOT CHANGE ABOVE CODE!  Write your code below
        System.out.println("Please enter month number");
       int month2=month.nextInt();

        switch (month2){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Febuary");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid");
                break;
        }

    }
}
