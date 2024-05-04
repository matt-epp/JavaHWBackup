package org.example.e73;

import java.util.Scanner;

/*
Create an array of integers that will store 5 elements taken from a user

Don't print any prompt message for the user

Then print out all the elements you have created in the first loop in reverse order.
 */
public class E73Arrays {
    public static void main(String[] args){

        int[] num=new int[5];

        for(int i=0;i<5;i++){

            Scanner scan = new Scanner(System.in);
            num[i]=scan.nextInt();

        }
        for(int j=4;j>=0;j--) {
            System.out.println(num[j]);

        }
    }
}