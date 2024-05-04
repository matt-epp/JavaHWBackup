package org.example.e79;
/*
Write a program that calculates the sum of elements from each row in a 2D array and adds them into array of
integers

For example, if we run rowSums for the following 2D array:
 */
public class E79Arrays {
    public static void main(String[] args) {
        int[][] a = {
                {1, 1, 2}, //sum = 4
                {3, 1, 2}, //sum = 6
                {3, 5, 3}, //sum = 11
                {0, 1, 2}  //sum = 3
        };
       //write code from here

        int sum=0;
        int[] sums = new int[a.length];
        for(int i = 0; i < a.length; i++){
            for(int num:a[i]){
                sum=sum+num;
            }
            sums[i] = sum;
            sum = 0;
        }
        for (int n:sums)
            System.out.println(n);



    }
}
