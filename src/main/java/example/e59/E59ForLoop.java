package org.example.e59;

public class E59ForLoop {
    /*
    Write a program that prints the string "Hey, it is year: " and the years between 2011 and 2019.
Must include year 2019 in the output

**Output:**

```
Hey, it is year:
2011...
     */
    public static void main(String[] args) {
        for(int i=2011;i<2020;i++){
            System.out.println("Hey, it is year:");
            System.out.println(i);
        }
    }
}
