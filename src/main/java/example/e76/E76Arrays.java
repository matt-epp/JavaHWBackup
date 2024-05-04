package org.example.e76;
/*
Write a program to double the values of every element in the array and print it out.
 */
public class E76Arrays {
    public static void main(String[] args) {
        //please write code from here
        double[][] a = {
                {1.4,2.0,3.3,2},
                {4,1.5,6.1,1},
                {1.2,3.1,4,1.6}
        };

//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
        for (double[] i : a) {
            for (double j : i) {
                System.out.print(j * 2 + " ");
            }
            System.out.println();


        }
    }
}
