package org.example.e130;
/*
Complete the mystery method so that it takes in an integer array as a parameter,
and then modifies each element based on whether it's even or odd.
If the number is even, divide it by 2. If it's odd, multiply it by 10.


**Output:**

```
10 1 30 2 50
 */
public class E130StaticKeyword {

    static double [] arr;

    static void mysteryMethod(double[] arr){
        for (int i = 1; i < arr.length+1; i++) {
            if ((i)%2==0){
                int num1=(i)/2;
                System.out.print(num1+" ");
            }else {
            int num2=(i)*10;
                System.out.print(num2+" ");
            }

        }
    }

    public static void main(String[] args) {

            double []ar={20,.1,60,4,5};
        mysteryMethod(ar);
    }
}
