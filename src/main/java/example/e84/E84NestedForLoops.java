package org.example.e84;
/*
Write a program to print out the pattern:

$$$$

$  $

$  $

$$$$
 */
public class E84NestedForLoops {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            System.out.print("$");
            if (i==1||i==2){
                System.out.print("  ");
            }
            else{
                System.out.print("$$");
            }
            System.out.print("$");
            if (i==1||i==2){
                System.out.print("  ");
            }
            System.out.println();
        }

    }
}
