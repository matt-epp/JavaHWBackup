package org.example.e107;

import java.util.Scanner;

/*
How would you reverse a String using StringBuffer Class
Given String = "Hello Friends"

**Expected Output**:

sdneirF olleH
 */
public class E107StringBuilder {
    public static void main(String[] args) {

        //Scanner scan=new Scanner(System.in);
        StringBuffer str= new StringBuffer("Hello Friends");
        StringBuffer reverse=str.reverse();
        System.out.println(reverse);

    }
}
