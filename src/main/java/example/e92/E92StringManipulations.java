package org.example.e92;
/*
Validate if the string ends with "u" prints the boolean value accordingly.

Validate if the string ends with "world" prints the boolean value accordingly.

Validate if the string ends with "are" prints the boolean value accordingly.

Validate if the string ends with "you" prints the boolean value accordingly.
 */

public class E92StringManipulations {
    public static void main(String[] args) {
        String s1 = "hello how are you";
        boolean end1=s1.endsWith("u");
        boolean end2=s1.endsWith("world");
        boolean end3=s1.endsWith("are");
        boolean end4=s1.endsWith("you");
        System.out.println(end1);
        System.out.println(end2);
        System.out.println(end3);
        System.out.println(end4);
    }
}
