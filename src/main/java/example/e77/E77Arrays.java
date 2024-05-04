package org.example.e77;
/*
Write a program that prints the highest value in the array.

**Expected Output:**
input [5,4,8]
 */
public class E77Arrays {
    public static void main(String[] args) {
        //write code from here
        int[] arr = {5, 4, 8};
        int max = arr[0];
        for (int a : arr) {
            if (max < a) {
                max = a;
            }


        }
        System.out.print(max);

    }
}