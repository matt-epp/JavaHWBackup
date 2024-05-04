package org.example.e105;
/*
There is a code that takes input as a String.
Write a program that will print out only vowels of that string

```
Sample input/outputs:
In: howdyho
oo

In: huehuehuehue
ueueueue

In: poopoo what idk what im doing
ooooaiaioi
 */
import java.util.Scanner;

public class E105StringManipulations {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        String wordVowels=word.replaceAll("[^aeiou]","");
        System.out.print(wordVowels);

            }

        }

