package org.example.e29;

/*
Write a java program that prints out true if ( x y ) returns a positive value. Else prints out false if (x y) returns a negative value.
Step 1: Your program should ask "Please enter first number" - for the 1st number and "Please enter second number" - for the 2nd number.
Step 2: Create if condition to check if the multiplication of x and y values is positive or negative.
If the result of a multiplication is positive print true, otherwise print false.


**Output:**

```
Example Output:
Please enter first number
Please enter second number
true

Example Output:
Please enter first number
Please enter second number
false
 */
import java.util.Scanner;

public class E29ScannerClass {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Please enter first number");
        double num1=value.nextDouble();
        System.out.println("Please enter second number");
        double num2=value.nextDouble();
        double result=num1*num2;

        if (result>0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
