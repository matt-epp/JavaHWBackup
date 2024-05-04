package org.example.e23;
/*
Create a program that will ask a user to input boolean value "Input the boolean value"
If the input is true or false, then the output should look like below:


**Output:**

```
Example Output:
Input the boolean value
The value is true
Example Output:
Input the boolean value
The value is false
 */
import java.util.Scanner;

public class E23ScannerClass {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Input the boolean value");
        boolean value = user.nextBoolean();
        if (value) {
            System.out.println("The value is " + value);
        } else {
            System.out.println("The value is " + value);
        }
    }
}
