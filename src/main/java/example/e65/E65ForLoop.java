package org.example.e65;

import java.util.Scanner;

public class E65ForLoop {
    /*
    Given the following inputs:
int x;
```
Write a for loop that will print out a series of numbers starting at one less than x and ending at 0.
**Output:**
```
In: 7
6 5 4 3 2 1 0
```
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x=input.nextInt();

        for(int i=x-1;i>=0;i--){
            System.out.print(i+" ");
        }

    }
}
