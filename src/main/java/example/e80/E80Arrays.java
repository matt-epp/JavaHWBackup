package org.example.e80;
/*
Write a program that prints the total number of elements that are negative AND odd

**Output:**
for example -3 is both negative and odd
 */
public class E80Arrays {
    public static void main(String[] args) {
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
       //write code from here

        int num = 0;
        for(int[] n : a)
        for(int j:n){
            if(j < 0 && j % 2 != 0){
                num++;

        }

        }
        System.out.print(num);
    }
}
