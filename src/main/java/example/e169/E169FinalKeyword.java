package org.example.e169;

import org.example.e168.E168FinalKeyword;

/*
Create final method avgElements that will average all the elements in an
integer array (passed to the method as a parameter) and return the average.


**Output:**

```
4.8
 */
public class E169FinalKeyword {
    final double avgElements(int [] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        return sum / arr.length;
    }
    public static void main(String[] args) {
            E169FinalKeyword obj1= new E169FinalKeyword();

            int [] arr={3,8,5,6,2};
            double result=(obj1.avgElements(arr));
            System.out.println(result);


        }

    }


