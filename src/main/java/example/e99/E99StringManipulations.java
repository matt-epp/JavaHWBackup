package org.example.e99;

import java.util.Scanner;

/*
Write code that will take in a String input and check to see if it is a palindrome or not.
A palindrome means that the characters are the same forwards and backwards, ignoring spaces.
Examples of palindromes:
racecar
was it a car or a cat I saw
never odd or even
rats live on no evil star
Your check should be case insensitive too. For example, "Bob" is a palindrome, despite the first B being capitalized.

Your program will print out "true" if it's a palindrome and "false" if not.
 */
public class E99StringManipulations {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String originalStr= scan.nextLine();
        StringBuilder st=new StringBuilder(originalStr);

        String reversedStr=st.reverse().toString();
        if(originalStr.equalsIgnoreCase(reversedStr)){
            System.out.println("In:true");
        }else
            System.out.println("In:false");


    }
}

