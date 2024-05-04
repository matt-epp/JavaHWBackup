package org.example.e78;
//Write a program that will print the sum of all elements in 2D array.
public class E78Arrays {
    public static void main(String[] args) {
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
//write the code from here

        int sum=0;
        for(int[] n:a){
            for(int num:n){
                sum=sum+num;
            }
        }
        System.out.println(sum);

    }
}
