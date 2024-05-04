package org.example.e104;
/*
Create an array of names that will hold 5 String elements.
Names must be taking from a user.
Print out the first three characters of each element of the array, one per line.
Note: every array element must be at least 3 characters long.

```
Input Example:
John
Jane
Jimmy
Mike
Emily
Expected Output:
Joh
Jan
Jim
Mik
Emi
 */
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Scanner;



public class E104StringManipulations {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        String[] strings = new String[5];

        //write code from here
        for (int i = 0; i < 5; i++) {
            strings[i] = input.next().substring(0,3);

        }for (int i = 0; i < 5; i++) {
            System.out.println(strings[i]);

        }

      //  String[] arr= new String[5];
        //for (int i = 0; i < arr.length; i++) {
//String[] arr = new String[]{input.nextLine()};
     //   String[] arr = new String[i];

         //   System.out.println("Enter next element");


           // arr[input];


        }
        /*  StringBuilder st=new StringBuilder("Sunday7343Monday");
        // only deletes one character
      //  st.deleteCharAt(6);
        // deletes a range of characters.
        st.delete(6,10);
        System.out.println(st);


HINT:
*/
       // String str= Arrays.toString(arr);
     //  System.out.println(str);

      //  for (int i = 0; i <arr.length ; i++) {
            // System.out.println(arr[i]);
          //  String [] firstThree=arr.
        }




